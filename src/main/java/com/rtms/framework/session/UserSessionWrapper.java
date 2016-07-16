package com.rtms.framework.session;

import javax.servlet.http.HttpServletRequest;

import com.rtms.entity.user.UserSession;
import com.rtms.service.BaseService;

public interface UserSessionWrapper{
		
	/**
	 * @param attributeName attributeName to be retrieved.
	 * @param sessionID sessionID 
	 */
	public UserSession createUserSession(final HttpServletRequest request);
	
	/**
	 * @param sessionID the sessionID
	 * @param attributeName attribute name whose value is to be set
	 * @param attributeValue the value to be set 
	 */
	public UserSession fetchUserSession(final String sessionID);
	
	public void setBaseService(final BaseService service);
	
}
