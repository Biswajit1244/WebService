package com.biss.filter;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class SecurityFilter implements ContainerRequestFilter{
			
	//Read RequestHeader Data
	@Context
	private HttpHeaders header;
			
	@Override
	public void filter(ContainerRequestContext req) throws IOException {
		//Read Authorization Data From Request
		List<String> authList=header.getRequestHeader("Authorization");
		if(authList==null || authList.isEmpty()) {
			req.abortWith(Response.status(Status.BAD_REQUEST)
									.entity("Enter Authentication Code").build());
			return;
		}else {
			String auth=authList.get(0);
			auth=auth.replace("Basic ","");
			//convert encoded data to byte[] format
			byte[] arr=Base64.getDecoder().decode(auth.getBytes());
			//convert to String
			auth=new String(arr);
			//Read Username and Pwd
			StringTokenizer str=new StringTokenizer(auth,":");
			
			String userName=str.nextToken();
			String pwd=str.nextToken();
			if(!(userName.equals("Biss1244") && pwd.equals("DjBravo"))) {
				req.abortWith(Response.status(Status.UNAUTHORIZED)
										.entity("Enter Valid UserName and Password").build());
			}
 		}
	}
}
