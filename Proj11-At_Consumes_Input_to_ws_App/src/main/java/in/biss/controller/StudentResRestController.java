package in.biss.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/std")
public class StudentResRestController {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String showResult(Student s) {
		return s.toString();
	}
}
