/**
 * This class is generated by jOOQ
 */
package by.heap.dao.jooq.tables.daos;


import by.heap.dao.jooq.tables.Films;
import by.heap.dao.jooq.tables.records.FilmsRecord;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmsDao extends DAOImpl<FilmsRecord, by.heap.dao.jooq.tables.pojos.Films, String> {

	/**
	 * Create a new FilmsDao without any configuration
	 */
	public FilmsDao() {
		super(Films.FILMS, by.heap.dao.jooq.tables.pojos.Films.class);
	}

	/**
	 * Create a new FilmsDao with an attached configuration
	 */
	public FilmsDao(Configuration configuration) {
		super(Films.FILMS, by.heap.dao.jooq.tables.pojos.Films.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getId(by.heap.dao.jooq.tables.pojos.Films object) {
		return object.getCode();
	}

	/**
	 * Fetch records that have <code>code IN (values)</code>
	 */
	public List<by.heap.dao.jooq.tables.pojos.Films> fetchByCode(String... values) {
		return fetch(Films.FILMS.CODE, values);
	}

	/**
	 * Fetch a unique record that has <code>code = value</code>
	 */
	public by.heap.dao.jooq.tables.pojos.Films fetchOneByCode(String value) {
		return fetchOne(Films.FILMS.CODE, value);
	}

	/**
	 * Fetch records that have <code>title IN (values)</code>
	 */
	public List<by.heap.dao.jooq.tables.pojos.Films> fetchByTitle(String... values) {
		return fetch(Films.FILMS.TITLE, values);
	}

	/**
	 * Fetch records that have <code>did IN (values)</code>
	 */
	public List<by.heap.dao.jooq.tables.pojos.Films> fetchByDid(Integer... values) {
		return fetch(Films.FILMS.DID, values);
	}

	/**
	 * Fetch records that have <code>date_prod IN (values)</code>
	 */
	public List<by.heap.dao.jooq.tables.pojos.Films> fetchByDateProd(Date... values) {
		return fetch(Films.FILMS.DATE_PROD, values);
	}

	/**
	 * Fetch records that have <code>kind IN (values)</code>
	 */
	public List<by.heap.dao.jooq.tables.pojos.Films> fetchByKind(String... values) {
		return fetch(Films.FILMS.KIND, values);
	}

	/**
	 * Fetch records that have <code>len IN (values)</code>
	 */
	public List<by.heap.dao.jooq.tables.pojos.Films> fetchByLen(Object... values) {
		return fetch(Films.FILMS.LEN, values);
	}
}