package com.biss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/user")
public class UserRestController {
	 
	@GET
	public Response validateUser(
			@HeaderParam("user") String user,
			@HeaderParam("pwd") String pwd
			) {
		Response res=null;
		if(user==null || user.isEmpty() || pwd==null || pwd.isEmpty()) {
			res=Response.status(Status.BAD_REQUEST).entity("NO DATA PROVIDED").build();
		}else if("biss".equalsIgnoreCase(user) && "djbravo".equals(pwd)) {
			res=Response.status(Status.OK).entity("WELCOME").build();
		}else {
			res=Response.status(Status.UNAUTHORIZED).entity("INVALID UN/PWD").build();
		}
		return res;
	}
}
