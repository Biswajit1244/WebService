package in.biss.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.biss.model.Contract;
import in.biss.model.Invoice;

@Path("/cnt")
public class ContractRestController {
	@Path("/one")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Contract showA() {
		return new Contract(12,"Miki",6.2,
					List.of("M!","M@","M#"),
					Map.of("M!","ABC","M@","BBC"));
	}
	@Path("/two")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Invoice> showB() {
		return Arrays.asList(new Invoice(101,"AA",69.3),
								new Invoice(102,"FA",6.65),
								new Invoice(103,"PA",89.3));
	}
	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String,Invoice> shoeC(){
		return Map.of("C!",new Invoice(101,"AA",69.3),
					  "C@",new Invoice(102,"FA",6.65));
	}
}
