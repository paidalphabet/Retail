package com.rtms.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.DispatcherServlet;

import com.rtms.framework.properties.ApplicationPropertiesConfigurator;
import com.rtms.user.service.UserService;

public class ControllerServlet extends DispatcherServlet {

	private static List<Plugin> plugins = new ArrayList<Plugin>();

	private final static String pluginProperty = "com.rtms.bootstrap.plugin.list";

	private String pluginList = null;
	

	public ControllerServlet() {
		super();
	}


	public ControllerServlet(AnnotationConfigWebApplicationContext ctx) {
		super(ctx);
		ApplicationContextHolder.setApplicationContext(ctx);
	}

	/**
	 * (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		initializeProperties();
		final ApplicationContext applicationContext = ApplicationContextHolder.getApplicationContext();
		try{
		initializePlugins(applicationContext);
		}catch(final Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * fetch list of properties from the application properties file.
	 */
	private void initializeProperties() {
		ApplicationPropertiesConfigurator.load();
		pluginList = ApplicationPropertiesConfigurator.getStringProperty(pluginProperty);
	}

	/**
	 * Initialize the list of plugins from the properties file process.
	 * @throws ClassNotFoundException 
	 * @throws BeansException 
	 */
	private void initializePlugins(final ApplicationContext context) throws BeansException, ClassNotFoundException {
		if (!StringUtils.isEmpty(pluginList)) {
			final StringTokenizer pluginTokens = new StringTokenizer(pluginList, ",");
			while (pluginTokens.hasMoreTokens()) {
				final String pluginClassName = pluginTokens.nextToken();
				final Plugin plugin = (Plugin) context.getBean(Class.forName(pluginClassName));
				plugins.add(plugin);
			}
		}
	}

	@Override
	protected void service(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		executePlugins(request, response, ApplicationContextHolder.getApplicationContext());
		super.service(request, response);
	}

	/**
	 * Iterate the list of plugins to perform each plugin's execution action.
	 * @param request httpservlet request
	 * @param response httpservlet response
	 */
	private void executePlugins(final HttpServletRequest request, final HttpServletResponse response, final ApplicationContext context) {
		final UserService service = context.getBean(UserService.class);
		for (final Plugin plugin : plugins) {
			plugin.execute(request, response, context, service);
		}

	}
}
