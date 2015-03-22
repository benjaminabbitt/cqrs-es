CREATE TABLE event_store(
  aggregateID UUID NOT NULL,
  payload VARCHAR NOT NULL,
  payload_type VARCHAR(255) NOT NULL,
  sequence_number BIGINT NOT NULL,
  added_time TIMESTAMP
);

CREATE TABLE aggregates(
  aggregateId UUID NOT NULL,
  aggregate_type varchar(255) NOT NULL,
  sequence_number BIGINT NOT NULL,
  updated_time TIMESTAMP
);


CREATE OR REPLACE FUNCTION addEvent (effected_aggregate_id UUID, effected_aggregate_type varchar(255), added_event VARCHAR, added_event_type VARCHAR(255), expected_version BIGINT) RETURNS void AS $$
DECLARE
  transaction_time         TIMESTAMP := now();
  previous_sequence_number BIGINT;
  this_sequence_number     BIGINT;
BEGIN
  SELECT sequence_number
  INTO previous_sequence_number
  FROM aggregates
  WHERE aggregateId = effected_aggregate_id;

  IF (previous_sequence_number IS NULL)
  THEN
    INSERT INTO aggregates (aggregateId, aggregate_type, sequence_number)
    VALUES (effected_aggregate_id, effected_aggregate_type, 0);
    previous_sequence_number := 0;
  END IF;

  IF (expected_version <> previous_sequence_number)
  THEN
    RAISE EXCEPTION 'Optimistic Concurrency Exception, found version % was expecting %', previous_sequence_number, expected_version;
  END IF;

  this_sequence_number := previous_sequence_number + 1;

  INSERT INTO event_store (aggregateId, payload, payload_type, sequence_number, added_time)
  VALUES (effected_aggregate_id, added_event, added_event_type, this_sequence_number, transaction_time);

  UPDATE aggregates
  SET sequence_number = this_sequence_number, updated_time = transaction_time
  WHERE aggregateId = effected_aggregate_id;
END;
$$ LANGUAGE plpgsql;