package com.rtms.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rtms.spring.redirection.constants.RedirectionConstants;
import com.rtms.spring.service.UserService;

@Controller
public class LoginController extends BaseController {
	
	private static final String LOGIN_ID  = "loginID";
	private static final String PASSWORD = "password";

	@Autowired
	UserService userService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getLogin(final HttpServletRequest request, final HttpServletResponse repsonse) {
		return new ModelAndView(RedirectionConstants.VIEW_LOGIN);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(final HttpServletRequest request,final HttpServletResponse response){
		final String loginID = request.getParameter(LOGIN_ID);
		final String password = request.getParameter(PASSWORD);
		String redirectView = RedirectionConstants.VIEW_LOGIN;
		boolean isUserAuthenticated = userService.validateLogin(loginID, password);
		if(isUserAuthenticated){
			redirectView = RedirectionConstants.VIEW_HOME_PAGE; 
		}
		return new ModelAndView(redirectView);
	}

}
	