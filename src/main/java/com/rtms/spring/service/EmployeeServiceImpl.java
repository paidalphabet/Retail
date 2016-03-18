package com.rtms.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.user.User;
import com.rtms.spring.dao.UserDao;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private UserDao dao;
	
	public User findById(int id) {
		return dao.findById(id);
	}

	public void saveEmployee(User employee) {
		dao.saveEmployee(employee);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateEmployee(User userObj) {
		User entity = dao.findById(userObj.getUserID());
		if(entity!=null){
			entity.setFirstName(userObj.getFirstName());
		}
	}

	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteUserByLoginID(ssn);
	}
	
	public List<User> findAllEmployees() {
		return dao.findAllUsers();
	}

	public User findEmployeeBySsn(String ssn) {
		return dao.findUserByLoginID(ssn);
	}

	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		User employee = findEmployeeBySsn(ssn);
		return ( employee == null || ((id != null) && (employee.getUserID() == id)));
	}
	
}
