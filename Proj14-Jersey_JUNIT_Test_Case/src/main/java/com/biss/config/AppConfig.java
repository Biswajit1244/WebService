package com.biss.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
//URL Pattern
@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig { //FC
	public AppConfig(){
		//init param
		packages("com.biss");
	}
}
