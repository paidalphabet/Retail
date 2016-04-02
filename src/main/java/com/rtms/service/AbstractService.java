package com.rtms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rtms.entity.BaseObject;
import com.rtms.spring.dao.UserDao;

public abstract class AbstractService  implements BaseService{
	
	
	@Autowired
	private UserDao basedao;
	
	@Override
	public Object getObjectByID(Class clazz, long objectID) {
		return basedao.getObjectByID(clazz, objectID);
	}
	
	@Override
	public Object getObjectByID(Class clazz, String objectID) {
		return basedao.getObjectByID(clazz, objectID);
	}
	
	public void save(final BaseObject object){
		basedao.saveBusinessObject(object);
	}
	
	public BaseObject update(final BaseObject object){
		basedao.updateBusinessObject(object);
		return object;
	}
	
	public void deleteObject(final BaseObject object){
		basedao.deleteObject(object);
	}

	

}
