package com.biss.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pay")
public class SecureRestController {
	
	@GET
	@Path("/payAmt")
	public String paymentBill() {
		return "PAYMENT SUCCESFULL";
	}
}
