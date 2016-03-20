package com.rtms.spring.dao;

import java.util.List;

import com.rtms.entity.user.User;


public interface UserDao {

	User findById(long l);

	User findByID(long l);

	void saveUser(User employee);
	
	void deleteUserByLoginID(String ssn);
	
	List<User> findAllUsers();

	User findUserByLoginID(String ssn);

	public User getUserByLoginID(final String loginID);
}
