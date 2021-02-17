package in.biss.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

@Path("/payment")
public class PaymentRestController {
	@POST
	@Path("/frm")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String doPayment(
			@FormParam("cnum")String cardNum,
			@FormParam("name")String name,
			@FormParam("cvv")int cvv,
			@FormParam("exp")String exp,
			@FormParam("amt")double amt) {
		StringBuffer msg=new StringBuffer();
		var bal=15000.0;
		if(amt>15000.0) {
			msg.append("Insufficient Fund");
		}else {
			bal=bal-amt;
			msg.append("Transacction Succesfull of:-"+amt+"\n")
			.append("Remaining Balance:-"+bal);
		}
		return msg.toString();
	}
	@POST
	@Path("/obj")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String doPaymentFrmObj(Form frm) {
		StringBuffer msg=new StringBuffer();
		MultivaluedMap<String, String> map=frm.asMap();
		System.out.println(map);
		List<String> listAmt=map.get("amt");
		System.out.println(listAmt.getClass().getName());
		System.out.println(listAmt);
		double amt=Double.parseDouble(listAmt.get(0));
		System.out.println(amt);
		var bal=15000.0;
		if(amt>15000.0) {
			msg.append("Insufficient Fund");
		}else {
			bal=bal-amt;
			msg.append("Transacction Succesfull of:-"+amt+"\n")
			.append("Remaining Balance:-"+bal);
		}
		return msg.toString();
	}
}
