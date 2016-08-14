package com.rtms.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextHolder {

	private static ApplicationContext context = null;

	private ApplicationContextHolder() {
		synchronized (this) {
			if (context == null) {
				context = new ClassPathXmlApplicationContext("controller-servlet.xml");
			}
		}
	}

	public static ApplicationContextHolder getInstance() {
		return new ApplicationContextHolder();
	}

	public static void setApplicationContext(final ApplicationContext context) {
		ApplicationContextHolder.context = context;
	}

	public static ApplicationContext getApplicationContext() {
		if (context == null) {
			context = new ClassPathXmlApplicationContext("controller-servlet.xml");
		}
		return context;
	}
}
