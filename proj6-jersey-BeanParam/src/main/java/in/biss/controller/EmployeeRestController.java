package in.biss.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import in.biss.model.Employee;

@Path("/emp")
public class EmployeeRestController {
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String showEmp(@BeanParam Employee emp) {
		return emp.toString();
	}
}
