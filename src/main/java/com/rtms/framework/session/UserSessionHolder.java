package com.rtms.framework.session;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import com.rtms.entity.user.UserSession;

public class UserSessionHolder {

	public static Map<Thread, UserSession> userSessionMap = new ConcurrentHashMap<Thread, UserSession>();
	
	private static final Logger LOGGER  = Logger.getLogger(UserSessionHolder.class.getName());

	public static void register(final UserSession userSession) {
		LOGGER.fine("Registered userSession " + userSession.getSessionID() + "with current thread  " + Thread.currentThread().getId());
		userSessionMap.put(Thread.currentThread(), userSession);
	}

	public static UserSession getSession() {
		return userSessionMap.get(Thread.currentThread());
	}

	public static void unregister() {
		LOGGER.fine("Un-registered usersession  on current thread  " + Thread.currentThread().getId());
		userSessionMap.remove(Thread.currentThread());
	}

}
