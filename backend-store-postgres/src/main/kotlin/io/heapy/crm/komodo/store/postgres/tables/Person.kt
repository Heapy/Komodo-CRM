/*
 * This file is generated by jOOQ.
 */
package io.heapy.crm.komodo.store.postgres.tables


import io.heapy.crm.komodo.store.postgres.Public
import io.heapy.crm.komodo.store.postgres.tables.records.PersonRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row2
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Person(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PersonRecord>?,
    aliased: Table<PersonRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<PersonRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.person</code>
         */
        val PERSON = Person()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PersonRecord> = PersonRecord::class.java

    /**
     * The column <code>public.person.id</code>.
     */
    val ID: TableField<PersonRecord, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.person.name</code>.
     */
    val NAME: TableField<PersonRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PersonRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<PersonRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.person</code> table reference
     */
    constructor(): this(DSL.name("person"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, PersonRecord>): this(Internal.createPathAlias(child, key), child, key, PERSON, null)
    override fun getSchema(): Schema = Public.PUBLIC
    override fun `as`(alias: String): Person = Person(DSL.name(alias), this)
    override fun `as`(alias: Name): Person = Person(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Person = Person(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Person = Person(name, null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Int?, String?> = super.fieldsRow() as Row2<Int?, String?>
}