package com.rtms.servlet;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.rtms.service.BaseService;
import com.rtms.user.service.UserServiceImpl;

@Component
public class RequestLoggingPlugin implements Plugin {
	
	private static final Logger LOGGER  = Logger.getLogger(UserServiceImpl.class.getName());
	public void execute(final HttpServletRequest request, final HttpServletResponse response, final ApplicationContext context, final BaseService service) {
		LOGGER.info("Logging : httpservletrequest & response");
	}

}
