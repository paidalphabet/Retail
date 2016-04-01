package com.rtms.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.rtms.entity.user.User;

public interface UserService {
	
	public static final String USER_ID = "userID";

	User findByID(int id);
	
	void saveUser(User user);
	
	void updateUser(final User user);
	
	void deleteUserByLoginID(final String loginID);

	List<User> findAllEmployees(); 
	
	User findEmployeeBySsn(final String loginID);

	boolean isEmployeeSsnUnique(final Integer id, final String loginID);

	/**
	 * returns if the user is a validated user or not.
	 * @param loginID user login ID  
	 * @param password password from the field
	 * @return if the user is an authentic user or not.
	 */
	String validateLogin(final String loginID,final String password);

	void createUserSession(final HttpServletRequest request, final String userID);
	
}
