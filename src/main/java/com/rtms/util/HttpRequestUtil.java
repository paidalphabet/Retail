package com.rtms.util;

import javax.servlet.http.HttpServletRequest;

public class HttpRequestUtil {
	
	public static Integer getIntegerParameter(final HttpServletRequest request, final String parameter){
		Integer intParameter = 0;
		final String intParam = request.getParameter(parameter);
		intParameter = Integer.parseInt(intParam);
		return intParameter;
	}

}
