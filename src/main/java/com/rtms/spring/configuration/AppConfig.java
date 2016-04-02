package com.rtms.spring.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.rtms.servlet.RequestLoggingPlugin;
import com.rtms.servlet.SessionPlugin;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rtms")
public class AppConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
	@Bean
	public MessageSource messageSource() {
	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.setBasename("messages");
	    return messageSource;
	}
	
	/*@Bean
	public RequestLoggingPlugin requestLoggingPlugin(){
		final String requestLoggingClassName = "com.rtms.servlet.RequestLoggingPlugin";
		RequestLoggingPlugin plugin = null;
		try {
			plugin = (RequestLoggingPlugin) Class.forName(requestLoggingClassName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return plugin;
	}
	
	@Bean
	public SessionPlugin sessionPlugin(){
		final String SessionPluginClassName = "com.rtms.servlet.SessionPlugin";
		SessionPlugin plugin = null;
		try {
			plugin = (SessionPlugin) Class.forName(SessionPluginClassName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return plugin;
	}*/
}

