package com.rtms.spring.dao;

import com.rtms.entity.BaseObject;

public interface BaseDao{
	
	public Object getObjectByID(final Class clazz, final long objectID);
	
	public Object getObjectByID(final Class clazz, final String objectID);
	
	public Object updateBusinessObject(final BaseObject object);

	public Object saveBusinessObject(final BaseObject object);
	
	public void deleteObject(final BaseObject object);
}
