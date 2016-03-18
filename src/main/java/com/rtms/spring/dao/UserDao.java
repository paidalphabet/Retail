package com.rtms.spring.dao;

import java.util.List;

import com.rtms.entity.user.User;


public interface UserDao {

	User findById(long l);

	void saveEmployee(User employee);
	
	void deleteUserByLoginID(String ssn);
	
	List<User> findAllUsers();

	User findUserByLoginID(String ssn);

}
