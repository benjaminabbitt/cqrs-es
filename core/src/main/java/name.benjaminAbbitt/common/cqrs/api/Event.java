package name.benjaminAbbitt.common.cqrs.api;

import java.util.UUID;

public interface Event extends Versioned{
    UUID getAggregateId();
}