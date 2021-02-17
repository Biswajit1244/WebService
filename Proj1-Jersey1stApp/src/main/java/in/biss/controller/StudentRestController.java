package in.biss.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/std")
public class StudentRestController {
	@GET
	public String fetchStudent() {
		return "FROM FETCH STUDENT";
	}
	@POST
	public String saveStudent() {
		return "STUDENT SAVED";
	}
	@PUT
	public String modifyStudent() {
		return "STUDENT MODIFIED";
	}
	
	@DELETE
	public String deleteStudent() {
		return "STUDENT DELETED";
	}
}
