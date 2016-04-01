package com.rtms.framework.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.Validate;

public class HttpSessionWrapperImpl implements HttpSessionWrapper{

	public Object getAttribute(String attributeName, String sessionID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAttribute(String sessionID, String attributeName, String attributeValue) {
		// TODO Auto-generated method stub
		
	}

	public Object getAttribute(HttpServletRequest request, String attributeName) {
		final HttpSession httpSession = request.getSession(true);
		final Object sessionObject = httpSession.getAttribute(attributeName); 
		return sessionObject;
	}

	public void setAttribute(HttpServletRequest request, String attributeName, String attributeValue) {
		Validate.notNull(attributeName, "Attribute Name cannot be null");
		Validate.notNull(attributeValue, "Attribute Value cannot be null");
		final HttpSession httpSession = request.getSession(true);
		httpSession.setAttribute(attributeName, attributeValue);		
	}
}
