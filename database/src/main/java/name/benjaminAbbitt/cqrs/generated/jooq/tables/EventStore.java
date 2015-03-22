/**
 * This class is generated by jOOQ
 */
package name.benjaminAbbitt.cqrs.generated.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventStore extends org.jooq.impl.TableImpl<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord> {

	private static final long serialVersionUID = -804402271;

	/**
	 * The reference instance of <code>public.event_store</code>
	 */
	public static final name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore EVENT_STORE = new name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord> getRecordType() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord.class;
	}

	/**
	 * The column <code>public.event_store.aggregateid</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord, java.util.UUID> AGGREGATEID = createField("aggregateid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>public.event_store.payload</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord, java.lang.String> PAYLOAD = createField("payload", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.event_store.payload_type</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord, java.lang.String> PAYLOAD_TYPE = createField("payload_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.event_store.sequence_number</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord, java.lang.Long> SEQUENCE_NUMBER = createField("sequence_number", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.event_store.added_time</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord, java.sql.Timestamp> ADDED_TIME = createField("added_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>public.event_store</code> table reference
	 */
	public EventStore() {
		this("event_store", null);
	}

	/**
	 * Create an aliased <code>public.event_store</code> table reference
	 */
	public EventStore(java.lang.String alias) {
		this(alias, name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore.EVENT_STORE);
	}

	private EventStore(java.lang.String alias, org.jooq.Table<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventStore(java.lang.String alias, org.jooq.Table<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.EventStoreRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, name.benjaminAbbitt.cqrs.generated.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore as(java.lang.String alias) {
		return new name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore(alias, this);
	}

	/**
	 * Rename this table
	 */
	public name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore rename(java.lang.String name) {
		return new name.benjaminAbbitt.cqrs.generated.jooq.tables.EventStore(name, null);
	}
}
