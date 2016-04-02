package com.rtms.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rtms.entity.user.UserSession;
import com.rtms.framework.session.SessionFacadeFactory;
import com.rtms.framework.session.UserSessionHolder;
import com.rtms.framework.session.UserSessionWrapper;
import com.rtms.service.BaseService;
import com.rtms.user.service.UserService;

@Component
public class SessionPlugin implements Plugin{
	
	public void execute(final HttpServletRequest request, final HttpServletResponse response, final ApplicationContext context, final BaseService service){
		final String sessionID = (String) SessionFacadeFactory.getInstance().getHttpSessionWrapper().getAttribute(request, UserService.SESSION_ID);
		if(StringUtils.isEmpty(sessionID)){
			final UserSession userSession = bootstrapUserSession(request, response, context, service);
			UserSessionHolder.register(userSession);
		}else{
			final UserSessionWrapper userSessionWrapper = SessionFacadeFactory.getInstance().getUserSessionWrapper();
			userSessionWrapper.setBaseService(service);
			final UserSession userSession = userSessionWrapper.fetchUserSession(sessionID);
			UserSessionHolder.register(userSession);
		}
		
	}

	private UserSession bootstrapUserSession(final HttpServletRequest request, final HttpServletResponse response, final ApplicationContext context, final BaseService service){
		final UserSessionWrapper userSessionWrapper = SessionFacadeFactory.getInstance().getUserSessionWrapper();
		userSessionWrapper.setBaseService(service);
		final UserSession userSession = userSessionWrapper.createUserSession(request);
		return userSession;
	}
}
