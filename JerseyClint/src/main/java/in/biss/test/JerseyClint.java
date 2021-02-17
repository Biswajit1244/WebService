package in.biss.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class JerseyClint {
	
	private static String uri="http://localhost:2020/Proj1-Jersey1stApp/";
	private static String path="/rest/std";

	public static void main(String[] args) {
		try {
			Client c=ClientBuilder.newClient();
			WebTarget wt=c.target(uri).path(path);
			Invocation.Builder ib=wt.request();
			Response res=ib.get();
			
			System.out.println(res.getStatus());
			System.out.println(res.getStatusInfo());
			System.out.println(res.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
