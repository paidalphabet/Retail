package com.rtms.spring.dao;

public interface BaseDao{
	
	public Object getObjectByID(final Class clazz, final long objectID);
	
	public Object updateBusinessObject(final Object object);

	public Object saveBusinessObject(final Object object);
}
