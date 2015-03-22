package name.benjaminAbbitt.common.cqrs.api;

import java.util.UUID;

public interface Command extends Versioned{
    UUID getAggregateId();
}