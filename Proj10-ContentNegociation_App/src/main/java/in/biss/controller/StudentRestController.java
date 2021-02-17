package in.biss.controller;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.biss.model.Address;
import in.biss.model.Student;

@Path("/std")
public class StudentRestController {
	@GET
	@Path("/data")
	@Produces({"application/json","application/xml"})
	//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student show() {
		return new Student(100,"AA",3.3,
				List.of("EN","MAT","TE"),
				Map.of("E",100,"R",25),
				new Address(6446, "HYD")
				);
	}
}
