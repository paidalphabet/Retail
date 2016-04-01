package com.rtms.framework.session;

final public class HttpSessionFactory {

	private static HttpSessionFactory INSTANCE = null;
	private static HttpSessionWrapper SESSION_WRAPPER = null;

	static {
		INSTANCE = new HttpSessionFactory();
		SESSION_WRAPPER = new HttpSessionWrapperImpl();
	}

	private HttpSessionFactory() {

	}

	public static HttpSessionFactory getInstance() {
		synchronized (HttpSessionFactory.class) {
			if (INSTANCE == null) {
				INSTANCE = new HttpSessionFactory();
			}
			return INSTANCE;
		}
	}
	
	/**
	 * Returns an instance of {@link HttpSessionWrapperImpl}
	 * @return {@link HttpSessionWrapper}
	 */
	public HttpSessionWrapper getHttpSessionWrapper(){
		return SESSION_WRAPPER;
	}
}
