package com.rtms.spring.service;

import java.util.List;

import com.rtms.entity.user.User;

public interface UserService {

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
	boolean validateLogin(String loginID, String password);
	
}
