package com.rtms.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.rtms.framework.session.UserSessionHolder;

public class SessionInterceptor extends HandlerInterceptorAdapter{
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		UserSessionHolder.unregister();
	}

}
