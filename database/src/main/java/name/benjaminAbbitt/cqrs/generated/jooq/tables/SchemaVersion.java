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
public class SchemaVersion extends org.jooq.impl.TableImpl<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord> {

	private static final long serialVersionUID = -1615447823;

	/**
	 * The reference instance of <code>public.schema_version</code>
	 */
	public static final name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion SCHEMA_VERSION = new name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord> getRecordType() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord.class;
	}

	/**
	 * The column <code>public.schema_version.version_rank</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.Integer> VERSION_RANK = createField("version_rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.installed_rank</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.Integer> INSTALLED_RANK = createField("installed_rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.version</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.description</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.type</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.script</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.String> SCRIPT = createField("script", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.checksum</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.Integer> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.schema_version.installed_by</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.String> INSTALLED_BY = createField("installed_by", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.installed_on</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.sql.Timestamp> INSTALLED_ON = createField("installed_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.schema_version.execution_time</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.Integer> EXECUTION_TIME = createField("execution_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.schema_version.success</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord, java.lang.Boolean> SUCCESS = createField("success", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>public.schema_version</code> table reference
	 */
	public SchemaVersion() {
		this("schema_version", null);
	}

	/**
	 * Create an aliased <code>public.schema_version</code> table reference
	 */
	public SchemaVersion(java.lang.String alias) {
		this(alias, name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION);
	}

	private SchemaVersion(java.lang.String alias, org.jooq.Table<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord> aliased) {
		this(alias, aliased, null);
	}

	private SchemaVersion(java.lang.String alias, org.jooq.Table<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, name.benjaminAbbitt.cqrs.generated.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord> getPrimaryKey() {
		return name.benjaminAbbitt.cqrs.generated.jooq.Keys.SCHEMA_VERSION_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord>>asList(name.benjaminAbbitt.cqrs.generated.jooq.Keys.SCHEMA_VERSION_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion as(java.lang.String alias) {
		return new name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion(alias, this);
	}

	/**
	 * Rename this table
	 */
	public name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion rename(java.lang.String name) {
		return new name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion(name, null);
	}
}