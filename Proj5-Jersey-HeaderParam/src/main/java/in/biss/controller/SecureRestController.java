package in.biss.controller;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/verify")
public class SecureRestController {
	@GET
	public String validateClient(@HeaderParam("auth")String auth,
							@DefaultValue("777")@HeaderParam("key")int key) {
		
		return "Authority details:-"+auth+"\nKey:-"+key;
	}
}
