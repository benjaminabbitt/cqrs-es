package name.benjaminAbbitt.common.cqrs.store;


import name.benjaminAbbitt.common.cqrs.api.Event;

import java.util.Iterator;
import java.util.List;

public interface EventStream<V> extends Iterable<Event> {
    DefaultEventStream append(List<? extends Event> newEvents);

    DefaultEventStream append(Event event);

    @Override
    Iterator<Event> iterator();

    public abstract V version();
}
