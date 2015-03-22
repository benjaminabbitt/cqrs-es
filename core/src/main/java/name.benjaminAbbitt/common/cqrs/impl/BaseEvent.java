package name.benjaminAbbitt.common.cqrs.impl;

import name.benjaminAbbitt.common.cqrs.api.Event;

import java.util.UUID;

public class BaseEvent implements Event {
    final UUID aggregateId;
    final Long version;

    public BaseEvent(UUID aggregateId, Long version) {
        this.aggregateId = aggregateId;
        this.version = version;
    }

    @Override
    public UUID getAggregateId() {
        return aggregateId;
    }

    @Override
    public Long getVersion() {
        return version;
    }

}
