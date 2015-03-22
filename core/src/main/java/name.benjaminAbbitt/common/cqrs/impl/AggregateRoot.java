package name.benjaminAbbitt.common.cqrs.impl;

import name.benjaminAbbitt.common.cqrs.api.Command;
import name.benjaminAbbitt.common.cqrs.api.Event;
import name.benjaminAbbitt.common.cqrs.api.Versioned;

import java.util.Arrays;
import java.util.List;

public abstract class AggregateRoot {
    Long version = 0L;

    protected void validateVersion(Command command) throws OptimisticConcurrencyException {
        validateVersion(command);
    }

    private void validateVersion(Versioned v) throws OptimisticConcurrencyException {
        if(this.version != v.getVersion() - 1){
            throw new OptimisticConcurrencyException();
        }
    }

    protected List<Event> mkList(Event... events){
        return Arrays.asList(events);
    }
}
