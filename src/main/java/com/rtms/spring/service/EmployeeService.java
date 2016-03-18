package com.rtms.spring.service;

import java.util.List;

import com.rtms.entity.user.User;

public interface EmployeeService {

	User findById(int id);
	
	void saveEmployee(User employee);
	
	void updateEmployee(User employee);
	
	void deleteEmployeeBySsn(String ssn);

	List<User> findAllEmployees(); 
	
	User findEmployeeBySsn(String ssn);

	boolean isEmployeeSsnUnique(Integer id, String ssn);
	
}
