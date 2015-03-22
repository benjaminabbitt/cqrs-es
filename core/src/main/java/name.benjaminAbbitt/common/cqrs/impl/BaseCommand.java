package name.benjaminAbbitt.common.cqrs.impl;

import java.util.UUID;

public class BaseCommand implements name.benjaminAbbitt.common.cqrs.api.Command {
    private final UUID aggregateId;
    private final Long version;

    public BaseCommand(UUID aggregateId, Long version) {
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
