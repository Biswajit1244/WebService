package in.biss.test;

import java.util.Arrays;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import in.biss.model.Result;
import in.biss.model.Student;

public class ConsumesTestClient {
	private static String uri="http://localhost:2020/Proj11-At_Consumes_Input_to_ws_App/";
	private static String path="/webapi/std";
	public static void main(String[] args) {
		try {
			Student s=new Student();
			s.setSid(455); s.setSname("Biss");
			s.setResults(Arrays.asList(new Result("Math", 56,"B+"),
										new Result("Eng", 69,"A")));
			Client c=ClientBuilder.newClient();
			WebTarget wt=c.target(uri).path(path);
			Invocation.Builder ib=wt.request();
			Response res=ib.post(Entity.json(s));
			
			System.out.println(res.getStatus());
			System.out.println(res.getStatusInfo());
			System.out.println(res.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
