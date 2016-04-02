package com.rtms.user.service;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.user.User;
import com.rtms.framework.session.HttpSessionWrapper;
import com.rtms.framework.session.SessionFacadeFactory;
import com.rtms.framework.session.UserSessionWrapper;
import com.rtms.service.AbstractService;
import com.rtms.spring.dao.UserDao;

@Service("userService")
@Transactional
public class UserServiceImpl extends AbstractService implements UserService {
	
	private static final Logger LOGGER  = Logger.getLogger(UserServiceImpl.class.getName());

	@Autowired
	private UserDao userdao;

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
		final SessionFacadeFactory factory = SessionFacadeFactory.getInstance();
		final HttpSessionWrapper sessionWrapper = factory.getHttpSessionWrapper();
		sessionWrapper.setAttribute(request, UserService.USER_ID, userID);
		final UserSessionWrapper userSessionWrapper = factory.getUserSessionWrapper();
		userSessionWrapper.setBaseService(this);
		userSessionWrapper.createUserSession(request);
		
	}

}
