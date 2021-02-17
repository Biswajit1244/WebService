package in.biss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/prod")
public class ProductController {
	@GET
	public String getPriceData(
			@QueryParam("pid") int prodId,
			@QueryParam("pname") String prodName,
			@QueryParam("cost") double cost
			) {
		double discount=cost*8/100;
		double gst=cost*0.018;
		double price=(cost-discount)+gst;
		
		return new StringBuilder()
				.append("PRODUCT:-").append(prodName+"  ").append(prodId+"\n")
				.append("DISCOUNT:-").append(discount+"\n")
				.append("CGST:-").append(gst/2+"\n")
				.append("SGST:-").append(gst/2+"\n")
				.append("Price:-").append(price).toString();
	}
}
