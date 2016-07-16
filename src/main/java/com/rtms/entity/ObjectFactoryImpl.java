package com.rtms.entity;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;

public class ObjectFactoryImpl implements  ObjectFactory{

	public static BaseObject create(final Class clazz) throws InstantiationException, IllegalAccessException, SecurityException, ClassNotFoundException{
		final BaseObject object = (BaseObject) Class.forName(clazz.getDeclaredClasses()[0].getName()).newInstance();
		return object;
	}

	@Override
	public Object getObjectInstance(final Object obj, final Name name, final Context nameCtx, final Hashtable<?, ?> environment) throws Exception {
		return null;
	}
}
