package com.rtms.framework.session;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rtms.entity.user.UserSession;
import com.rtms.service.BaseService;
import com.rtms.user.service.UserService;

@Component
public class UserSessionWrapperImpl implements UserSessionWrapper {
	
	@Autowired
	private UserService userService;

	@Override
	public UserSession createUserSession(final HttpServletRequest request) {
		final UserSession userSession = new UserSession();
		bootstrapUserSession(userSession, request);
		final long sessionID = userSession.getSessionID();
		SessionFacadeFactory.getInstance().getHttpSessionWrapper().setAttribute(request, UserService.SESSION_ID, String.valueOf(sessionID));
		return userSession;
	}

	private void bootstrapUserSession(final UserSession userSession, final HttpServletRequest request) {		
		final String userID = (String) SessionFacadeFactory.getInstance().getHttpSessionWrapper().getAttribute(request, UserService.USER_ID);
		final String isAuthenticated = !StringUtils.isEmpty(userID) ? "1" : "0";
		final String shopperIPAddress = request.getRemoteHost();
		
		userSession.setUserID(userID);
		userSession.setModificationDate(new Date());
		userSession.setCreationDate(new Date());
		userSession.setShopperIPAddress(shopperIPAddress);
		userSession.setIsAuthenticated(isAuthenticated);
		
		userService.save(userSession);
		
	}

	@Override
	public UserSession fetchUserSession(final String sessionID) {
		final long userSessionID = Long.parseLong(sessionID);
		final UserSession userSession = (UserSession) userService.getObjectByID(UserSession.class, userSessionID);
		return userSession;
	}

	@Override
	public void setBaseService(final BaseService service) {
		this.userService = (UserService) service;		
	}

}
