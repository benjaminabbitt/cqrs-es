package name.benjaminAbbitt.common.cqrs.impl;

import name.benjaminAbbitt.common.cqrs.api.Command;
import name.benjaminAbbitt.common.cqrs.api.Event;
import name.benjaminAbbitt.common.cqrs.api.Sneak;
import name.benjaminAbbitt.common.cqrs.store.EventStore;
import name.benjaminAbbitt.common.cqrs.store.EventStream;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;


public class ApplicationService {
    private static final String HANDLE_METHOD = "handle";
    private final EventStore eventStore;
    private CommandHandlerLookup commandHandlerLookup;

    public ApplicationService(EventStore eventStore, Class<?>... aggregateTypes) {
        this.eventStore = eventStore;
        this.commandHandlerLookup = new CommandHandlerLookup(HANDLE_METHOD, aggregateTypes);
    }

    public List<? extends Event> handle(Command command) throws Exception {
        EventStream<Long> eventStream = eventStore.loadEventStream(command.getAggregateId());
        Object target = newAggregateInstance(command);
        for (Event event : eventStream) {
            handle(target, event);
        }
        List<? extends Event> events = handle(target, command);
        //noinspection StatementWithEmptyBody
        if (events != null && events.size() > 0) {
            eventStore.store(command.getAggregateId(), target.getClass(), eventStream.version(), events);
        } else {
            /* NOP: Command generated no events */
        }
        return events;
    }

    private Object newAggregateInstance(Command command) throws InstantiationException, IllegalAccessException {
        return commandHandlerLookup.targetType(command).newInstance();
    }

    @SuppressWarnings("unchecked")
    private <R> R handle(Object target, Object param) throws Exception {
        Method method = target.getClass().getMethod(HANDLE_METHOD, param.getClass());
        try {
            return (R) method.invoke(target, param);
        } catch (InvocationTargetException e) {
            throw Sneak.sneakyThrow(e.getTargetException());
        }
    }
}
