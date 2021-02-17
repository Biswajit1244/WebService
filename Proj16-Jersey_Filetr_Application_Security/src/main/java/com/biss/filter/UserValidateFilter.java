package com.biss.filter;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class UserValidateFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext req) throws IOException {
		//1.List <String>
		List<String> al=List.of("NIT","BMS","ICICI");
		//2.Read Header Param
		List<String> authHeader=req.getHeaders().get("Auth");
		//3.Check for null or Diff value and return error msg
		if(authHeader==null || authHeader.isEmpty()) {
			req.abortWith(Response.status(Status.BAD_REQUEST).entity("NO DATA FOUND").build());
		return;
		}else {
			String auth=authHeader.get(0);
			if(!al.contains(auth)) {
				req.abortWith(Response.status(Status.UNAUTHORIZED).entity("NOT A VALID CLIENT").build());				
			return;
			}
		}
	}

}
