package name.benjaminAbbitt.common.cqrs.store;

import name.benjaminAbbitt.common.cqrs.api.Event;

import java.util.List;
import java.util.UUID;


public interface EventStore<V> {
    EventStream<Long> loadEventStream(UUID aggregateId) throws ClassNotFoundException;
    void store(UUID aggregateId, Class aggregateType, long version, List<? extends Event> events);
    EventStream<V> loadEventsAfter(V globalVersion);
}