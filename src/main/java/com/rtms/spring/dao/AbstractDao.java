package com.rtms.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.BaseObject;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public abstract class AbstractDao implements BaseDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @param clazz Persistence class
	 * @param objectID object ID
	 * @return
	 */
	public Object getObjectByID(final Class clazz, final long objectID) {
		return getSession().get(clazz, objectID);
	}
	
	/**
	 * @param clazz Persistence class
	 * @param objectID object ID
	 * @return
	 */
	public Object getObjectByID(final Class clazz, final String objectID) {
		return getSession().get(clazz, objectID);
	}


	@Override
	public Object saveBusinessObject(final BaseObject object) {
		final Session session = getSession();
		session.save(object);
		return object;
	}

	@Override
	public Object updateBusinessObject(final BaseObject object) {
		final Session session = getSession();
		session.saveOrUpdate(object);
		return object;
	}
	
	@Override
	public void deleteObject(final BaseObject object) {
		final Session session = getSession();
		session.delete(object);
	}

}
