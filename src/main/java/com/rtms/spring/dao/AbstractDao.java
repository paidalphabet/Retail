package com.rtms.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao implements BaseDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @param clazz
	 *            Persistence class
	 * @param objectID
	 *            object ID
	 * @return
	 */
	public Object getObjectByID(final Class clazz, long objectID) {
		return getSession().get(clazz, objectID);
	}

	@Override
	public Object saveBusinessObject(final Object object) {
		final Session session = getSession();
		session.save(object);
		return object;
	}

	@Override
	public Object updateBusinessObject(final Object object) {
		final Session session = getSession();
		session.update(object);
		return object;
	}

}
