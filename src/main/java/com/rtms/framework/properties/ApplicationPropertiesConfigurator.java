package com.rtms.framework.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationPropertiesConfigurator {

	private static Properties properties = null;

	private static final Object mutex = new Object();

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationPropertiesConfigurator.class);

	private final static String PROPERTIES_FILE = "/application.properties";

	public static void load() {
		try {
			LOGGER.debug("Re-load properties" + properties);
			properties = new Properties();
			final InputStream inputStream = ApplicationPropertiesConfigurator.class.getResourceAsStream(PROPERTIES_FILE);
			properties.load(inputStream);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static String getStringProperty(final String propertyName) {
		if (properties == null) {
			synchronized (mutex) {
				load();
			}
		}
		return properties.getProperty(propertyName.trim());
	}
	
	public static boolean getBooleanProperty(final String propertyName) {
		if (properties == null) {
			synchronized (mutex) {
				load();
			}
		}
		final Object property = properties.getProperty(propertyName.trim()); 
		return Boolean.getBoolean((String) property);
	}

	public static void setProperty(final String propertyName, final String propertyValue) {
		Validate.notNull(propertyName);
		Validate.notNull(propertyValue);
		if (properties == null) {
			synchronized (mutex) {
				load();
			}
		}
		properties.setProperty(propertyName.trim(), propertyValue.trim());
	}

}
