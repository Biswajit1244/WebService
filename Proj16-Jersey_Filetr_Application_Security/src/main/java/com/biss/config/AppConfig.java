package com.biss.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.biss.filter.UserValidateFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{
	
	public AppConfig() {
		packages("com.biss");
		register(UserValidateFilter.class);
	}
}
