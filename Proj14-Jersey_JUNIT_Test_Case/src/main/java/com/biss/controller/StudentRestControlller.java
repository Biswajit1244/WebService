package com.biss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/std")
public class StudentRestControlller {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/one")
	public String showData() {
		return "Hello";
	}
}
