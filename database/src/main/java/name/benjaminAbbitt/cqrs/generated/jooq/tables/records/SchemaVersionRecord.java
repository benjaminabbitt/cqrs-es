/**
 * This class is generated by jOOQ
 */
package name.benjaminAbbitt.cqrs.generated.jooq.tables.records;

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
public class SchemaVersionRecord extends org.jooq.impl.UpdatableRecordImpl<name.benjaminAbbitt.cqrs.generated.jooq.tables.records.SchemaVersionRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Boolean> {

	private static final long serialVersionUID = -1317725786;

	/**
	 * Setter for <code>public.schema_version.version_rank</code>.
	 */
	public void setVersionRank(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.schema_version.version_rank</code>.
	 */
	public java.lang.Integer getVersionRank() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.schema_version.installed_rank</code>.
	 */
	public void setInstalledRank(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.schema_version.installed_rank</code>.
	 */
	public java.lang.Integer getInstalledRank() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.schema_version.version</code>.
	 */
	public void setVersion(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.schema_version.version</code>.
	 */
	public java.lang.String getVersion() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.schema_version.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.schema_version.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.schema_version.type</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.schema_version.type</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.schema_version.script</code>.
	 */
	public void setScript(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.schema_version.script</code>.
	 */
	public java.lang.String getScript() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.schema_version.checksum</code>.
	 */
	public void setChecksum(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.schema_version.checksum</code>.
	 */
	public java.lang.Integer getChecksum() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.schema_version.installed_by</code>.
	 */
	public void setInstalledBy(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.schema_version.installed_by</code>.
	 */
	public java.lang.String getInstalledBy() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>public.schema_version.installed_on</code>.
	 */
	public void setInstalledOn(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.schema_version.installed_on</code>.
	 */
	public java.sql.Timestamp getInstalledOn() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>public.schema_version.execution_time</code>.
	 */
	public void setExecutionTime(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.schema_version.execution_time</code>.
	 */
	public java.lang.Integer getExecutionTime() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>public.schema_version.success</code>.
	 */
	public void setSuccess(java.lang.Boolean value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.schema_version.success</code>.
	 */
	public java.lang.Boolean getSuccess() {
		return (java.lang.Boolean) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.VERSION_RANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.SCRIPT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.CHECKSUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.INSTALLED_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.INSTALLED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.EXECUTION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field11() {
		return name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION.SUCCESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getVersionRank();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getInstalledRank();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getScript();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getChecksum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getInstalledBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getInstalledOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getExecutionTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value11() {
		return getSuccess();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value1(java.lang.Integer value) {
		setVersionRank(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value2(java.lang.Integer value) {
		setInstalledRank(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value3(java.lang.String value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value4(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value5(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value6(java.lang.String value) {
		setScript(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value7(java.lang.Integer value) {
		setChecksum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value8(java.lang.String value) {
		setInstalledBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value9(java.sql.Timestamp value) {
		setInstalledOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value10(java.lang.Integer value) {
		setExecutionTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord value11(java.lang.Boolean value) {
		setSuccess(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaVersionRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.Integer value7, java.lang.String value8, java.sql.Timestamp value9, java.lang.Integer value10, java.lang.Boolean value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SchemaVersionRecord
	 */
	public SchemaVersionRecord() {
		super(name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION);
	}

	/**
	 * Create a detached, initialised SchemaVersionRecord
	 */
	public SchemaVersionRecord(java.lang.Integer versionRank, java.lang.Integer installedRank, java.lang.String version, java.lang.String description, java.lang.String type, java.lang.String script, java.lang.Integer checksum, java.lang.String installedBy, java.sql.Timestamp installedOn, java.lang.Integer executionTime, java.lang.Boolean success) {
		super(name.benjaminAbbitt.cqrs.generated.jooq.tables.SchemaVersion.SCHEMA_VERSION);

		setValue(0, versionRank);
		setValue(1, installedRank);
		setValue(2, version);
		setValue(3, description);
		setValue(4, type);
		setValue(5, script);
		setValue(6, checksum);
		setValue(7, installedBy);
		setValue(8, installedOn);
		setValue(9, executionTime);
		setValue(10, success);
	}
}
