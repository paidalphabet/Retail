package com.rtms.framework.session;

import java.util.logging.Logger;

import com.rtms.entity.user.UserSession;

public class UserSessionHolder {

	public static ThreadLocal currentUserSession = new ThreadLocal();
	
	private static final Logger LOGGER  = Logger.getLogger(UserSessionHolder.class.getName());

	public static void register(final UserSession userSession) {
		LOGGER.fine("Registered userSession " + userSession.getSessionID() + "with current thread  " + Thread.currentThread().getId());
		currentUserSession.set(userSession);
	}

	public static UserSession getSession() {
		return (UserSession) currentUserSession.get();
	}

	public static void unregister() {
		LOGGER.fine("Un-registered usersession  on current thread  " + Thread.currentThread().getId());
		currentUserSession.remove();
	}
}
