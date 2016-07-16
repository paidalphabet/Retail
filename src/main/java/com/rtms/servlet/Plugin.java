package com.rtms.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.rtms.service.BaseService;

public interface Plugin {
	public void execute(final HttpServletRequest request, final HttpServletResponse response, final ApplicationContext context, final BaseService service);
}
