package com.biss.test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class TestUserRestController extends JerseyTest{
	@Override
	protected Application configure() {
		return new ResourceConfig() {{
			packages("com.biss");
		}};
	}
	@Test
	public void testValidateNull() {
		Response res=target("/user").request().get();
		res.bufferEntity();
		
		assertEquals(Status.BAD_REQUEST.getStatusCode(), res.getStatus());
		assertEquals("NO DATA PROVIDED", res.readEntity(String.class));
	}
	@Test
	public void testValidateActual() {
		Response res=target("/user").request()
				.header("user","Biss")
				.header("pwd","djbravo")
				.get();
	
		assertEquals(Status.OK.getStatusCode(), res.getStatus());
		assertEquals("WELCOME", res.readEntity(String.class));
	}
	@Test
	public void testValidateError() {
		Response res=target("/user").request()
				.header("user","Biss")
				.header("pwd","djbra")
				.get();
		
		assertEquals(Status.UNAUTHORIZED.getStatusCode(), res.getStatus());
		assertEquals("INVALID UN/PWD", res.readEntity(String.class));
		
	}
}
