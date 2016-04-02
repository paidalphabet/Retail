package com.rtms.spring.service;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
	
	public static final String USER_ID = "userID";

	/**
	 * returns if the user is a validated user or not.
	 * @param loginID user login ID  
	 * @param password password from the field
	 * @return if the user is an authentic user or not.
	 */
	String validateLogin(final String loginID,final String password);

	void createUserSession(final HttpServletRequest request, final String userID);
	
}
