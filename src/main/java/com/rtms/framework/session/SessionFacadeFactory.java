package com.rtms.framework.session;

final public class SessionFacadeFactory {

	private static SessionFacadeFactory INSTANCE = null;
	private static HttpSessionWrapper HTTP_SESSION_WRAPPER = null;
	private static UserSessionWrapper USER_SESSION_WRAPPER = null;

	static {
		INSTANCE = new SessionFacadeFactory();
		HTTP_SESSION_WRAPPER = new HttpSessionWrapperImpl();
		USER_SESSION_WRAPPER = new UserSessionWrapperImpl();		
	}

	private SessionFacadeFactory() {

	}

	public static SessionFacadeFactory getInstance() {
		synchronized (SessionFacadeFactory.class) {
			if (INSTANCE == null) {
				INSTANCE = new SessionFacadeFactory();
			}
			return INSTANCE;
		}
	}

	/**
	 * Returns an instance of {@link HttpSessionWrapperImpl}
	 * 
	 * @return {@link HttpSessionWrapper}
	 */
	public HttpSessionWrapper getHttpSessionWrapper() {
		return HTTP_SESSION_WRAPPER;
	}
	
	/**
	 * Returns an instance of {@link UserSessionWrapperImpl}
	 * 
	 * @return {@link UserSessionWrapper}
	 */
	public UserSessionWrapper getUserSessionWrapper() {
		return USER_SESSION_WRAPPER;
	}
}
