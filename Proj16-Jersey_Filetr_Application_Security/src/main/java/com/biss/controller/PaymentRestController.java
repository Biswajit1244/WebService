package com.biss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pay")
public class PaymentRestController {
	@GET
	public String pay() {
		return "WELCOME TO PAYMENT PAGE";
	}
}
