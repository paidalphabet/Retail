package com.rtms.framework.session;

import javax.servlet.http.HttpServletRequest;

public interface HttpSessionWrapper {
		
	/**
	 * @param attributeName attributeName to be retrieved.
	 * @param sessionID sessionID 
	 */
	public Object getAttribute(final String attributeName,final String sessionID);
	
	/**
	 * @param sessionID the sessionID
	 * @param attributeName attribute name whose value is to be set
	 * @param attributeValue the value to be set 
	 */
	void setAttribute(final String sessionID,final String attributeName, final String attributeValue);
	
	/**
	 * @param attributeName attributeName to be retrieved.
	 * @param sessionID sessionID 
	 */
	public Object getAttribute(final HttpServletRequest request, final String attributeName);
	
	/**
	 * @param sessionID the sessionID
	 * @param attributeName attribute name whose value is to be set
	 * @param attributeValue the value to be set 
	 */
	void setAttribute(final HttpServletRequest request, final String attributeName, final String attributeValue);
	
	
}
