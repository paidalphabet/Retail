package com.rtms.spring.service;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.user.User;
import com.rtms.framework.session.HttpSessionFactory;
import com.rtms.framework.session.HttpSessionWrapper;
import com.rtms.spring.dao.UserDao;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER  = Logger.getLogger(UserServiceImpl.class.getName());

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
	public String validateLogin(String loginID, String password) {
		final User user = userdao.getUserByLoginID(loginID);
		String userID = null;
		if (user != null && StringUtils.equals(user.getPassword(), password)) {
			userID = String.valueOf(user.getUserID());
		}
		return userID;
	}

	public void createUserSession(final HttpServletRequest request,final String userID) {
		LOGGER.finest("Creating session for userID : " + userID);
		final HttpSessionFactory factory = HttpSessionFactory.getInstance();
		final HttpSessionWrapper sessionWrapper = factory.getHttpSessionWrapper();
		sessionWrapper.setAttribute(request, UserService.USER_ID, userID);
	}

}
