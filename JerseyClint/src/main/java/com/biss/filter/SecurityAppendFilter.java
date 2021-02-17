package com.biss.filter;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

public class SecurityAppendFilter implements ClientRequestFilter {

	public void filter(ClientRequestContext requestContext) throws IOException {
		requestContext.getHeaders().add("Auth","NIT");
	}

}
