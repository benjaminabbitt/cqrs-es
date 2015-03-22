package name.benjaminAbbitt.common.cqrs.store.pgsql;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static name.benjaminAbbitt.cqrs.generated.jooq.Tables.*;

import name.benjaminAbbitt.cqrs.generated.jooq.Routines;
import name.benjaminAbbitt.common.cqrs.api.Event;
import name.benjaminAbbitt.common.cqrs.store.DefaultEventStream;
import name.benjaminAbbitt.common.cqrs.store.EventStore;
import name.benjaminAbbitt.common.cqrs.store.EventStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;


public class SqlEventStore implements EventStore<Long> {
    private final DSLContext create;
    private final ObjectMapper mapper;

    public SqlEventStore(Connection conn, ObjectMapper mapper) {
        create = DSL.using(conn, SQLDialect.POSTGRES);
        this.mapper = mapper;
    }

    @Override
    public EventStream<Long> loadEventStream(UUID aggregateId) {
        Result<Record> results = create.select().from(EVENT_STORE).orderBy(EVENT_STORE.SEQUENCE_NUMBER).fetch();
        return resultSetToEventStream(results);
    }

    private EventStream<Long> resultSetToEventStream(Result<Record> results) {
        EventStream<Long> eventStream = new DefaultEventStream();
        for (Record r : results) {
            Class clazz = null;
            try {
                clazz = Class.forName(r.getValue(EVENT_STORE.PAYLOAD_TYPE));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            String payload = r.getValue(EVENT_STORE.PAYLOAD);
            try {
                if (payload != null && clazz != null) {
                    eventStream.append((Event) mapper.readValue(payload, clazz));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return eventStream;
    }

    @Override
    public void store(UUID aggregateId, Class aggregateType, long version, List<? extends Event> events) {
        for (Event event : events) {
            String serEvent = null;
            try {
                serEvent = mapper.writeValueAsString(event);
            } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
                e.printStackTrace();
            }
            try {
                Routines.addevent(create.configuration(), aggregateId, aggregateType.getCanonicalName(), serEvent, event.getClass().getCanonicalName(), event.getVersion());
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public EventStream<Long> loadEventsAfter(Long version) {
        Result<Record> rs = create.select().from(EVENT_STORE).where(EVENT_STORE.SEQUENCE_NUMBER.greaterThan(version)).orderBy(EVENT_STORE.SEQUENCE_NUMBER).fetch();
        return resultSetToEventStream(rs);
    }


    public EventStream<Long> loadEventsAfterTime(ZonedDateTime timestamp) {
        Timestamp ts = new Timestamp(timestamp.toInstant().toEpochMilli());
        Result<Record> rs = create.select().from(EVENT_STORE).where(EVENT_STORE.ADDED_TIME.greaterThan(ts)).orderBy(EVENT_STORE.SEQUENCE_NUMBER).fetch();
        return resultSetToEventStream(rs);
    }

}


