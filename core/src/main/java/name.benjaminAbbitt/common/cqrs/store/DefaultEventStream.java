package name.benjaminAbbitt.common.cqrs.store;

import name.benjaminAbbitt.common.cqrs.api.Event;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DefaultEventStream implements EventStream<Long> {
    private final long version;
    private final List<Event> events;

    public DefaultEventStream() {
        this.version = 0;
        events = Collections.emptyList();
    }

    public DefaultEventStream(long version, List<Event> events) {
        this.version = version;
        this.events = events;
    }

    @Override
    public DefaultEventStream append(List<? extends Event> newEvents) {
        List<Event> events = new LinkedList<Event>(this.events);
        events.addAll(newEvents);
        return new DefaultEventStream(version+1, Collections.unmodifiableList(events));
    }

    @Override
    public DefaultEventStream append(Event event){
        events.add(event);
        return new DefaultEventStream(version+1, Collections.unmodifiableList(events));
    }

    @Override
    public Iterator<Event> iterator() {
        return events.iterator();
    }

    @Override
    public Long version() {
        return version;
    }

}
