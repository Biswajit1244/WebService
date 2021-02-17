package in.biss.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import in.biss.model.Student;

public class ContentNegociationClient {
	private static String uri="http://localhost:2020/Proj10-ContentNegociation_App/";
	private static String path="/rest/std/data";
	
	public static void main(String[] args) {
		try {	
		Client c=ClientBuilder.newClient();
		WebTarget wt=c.target(uri).path(path);
		Invocation.Builder builder=wt.request();
		Response resp=builder.header("Accept","application/xml").get();
		
		System.out.println(resp.getStatus());
		System.out.println(resp.getStatusInfo());
		System.out.println(resp.readEntity(Student.class));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
