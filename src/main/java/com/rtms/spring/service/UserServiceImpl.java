package com.rtms.spring.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.user.User;
import com.rtms.spring.dao.UserDao;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;

	public User findByID(int id) {
		return userdao.findByID(id);
	}

	public void saveUser(final User user) {
		userdao.saveUser(user);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate
	 * update explicitly. Just fetch the entity from db and update it with
	 * proper values within transaction. It will be updated in db once
	 * transaction ends.
	 */
	public void updateUser(final User userObj) {
		User entity = userdao.findByID(userObj.getUserID());
		if (entity != null) {
			entity.setFirstName(userObj.getFirstName());
		}
	}

	public void deleteUserByLoginID(final String loginID) {
		userdao.deleteUserByLoginID(loginID);
	}

	public List<User> findAllEmployees() {
		return userdao.findAllUsers();
	}

	public User findEmployeeBySsn(String ssn) {
		return userdao.findUserByLoginID(ssn);
	}

	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		User employee = findEmployeeBySsn(ssn);
		return (employee == null || ((id != null) && (employee.getUserID() == id)));
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean validateLogin(String loginID, String password) {
		final User user = userdao.getUserByLoginID(loginID);
		boolean isUserValidated = false;
		if (user != null && StringUtils.equals(user.getPassword(), password)) {
			isUserValidated = true;
		}
		return isUserValidated;
	}

}
