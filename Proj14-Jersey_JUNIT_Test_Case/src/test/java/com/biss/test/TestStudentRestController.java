package com.biss.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.biss.controller.StudentRestControlller;

public class TestStudentRestController extends JerseyTest {

	private String path=null;
	private Object entity=null;
	private Object status=0;
	
	
	@Override
	protected Application configure() {
		return new ResourceConfig(StudentRestControlller.class);
	}
	//----provide initial data---
	@Before
	public void setup() {
		path="/std/one";
		entity="Hello";
		status=200;
	}
	//---Write test case----
	@Test
	public void testShowDataA() {
		WebTarget wt=target();
		Response resp=wt.path(path).request().get();
		String s=resp.readEntity(String.class);
		
		assertNotNull(s);
		assertEquals(entity,s);
		assertEquals(status, resp.getStatus());
		assertEquals(MediaType.TEXT_PLAIN_TYPE,resp.getMediaType());
	}
	//reset back to default values
	@After
	public void cleanData() {
		path=null;
		entity=null;
		status=0;
	}
}
