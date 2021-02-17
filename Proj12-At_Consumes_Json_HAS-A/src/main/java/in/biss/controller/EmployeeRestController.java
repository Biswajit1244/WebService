package in.biss.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import in.biss.model.Employee;

@Path("/emp")
public class EmployeeRestController {

	@POST
	@Consumes("application/json")
	public String showEmpInfo(Employee e) {
		return e.toString();
	}
}
