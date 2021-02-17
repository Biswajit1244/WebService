package in.biss.controller;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/mail")
public class EmailRestController {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response sendMessage(
				@FormParam("to")String to,
				@FormParam("sub")String sub,
				@FormParam("text")String text)
	{
	Response resp=null;
	if(to==null || to.isBlank()
			|| sub==null || sub.isBlank()
			|| text==null || text.isBlank())
	{
	resp=Response
			.status(Status.BAD_REQUEST)
			.entity("Not All Inputs provided")
			.build();
	}else {
	try {
	//email props
	Properties p=new Properties();
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.port", 587);
		p.put("mail.smtp.auth", true);
		p.put("mail.smtp.starttls.enable", true);
	//2. user details (un/pwd)
	final String user="bbeu98615@gmail.com";
	final String pwd="biaswa9861";
	//3. Email Session
	Session ses=Session.getInstance(p, new Authenticator() {
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(user,pwd);
		}
	});
	//4. Message
	MimeMessage m=new MimeMessage(ses);
		m.setRecipient(RecipientType.TO, new InternetAddress(to));
		m.setSubject(sub);
		m.setText(text);
	//5. send email
	Transport.send(m);
	resp=Response
			.status(Status.OK)
			.entity("Email Sent!!")
			.build();
	} catch (Exception e) {
	resp=Response
			.status(Status.INTERNAL_SERVER_ERROR)
			.entity("Unable to send email")
			.build();
		e.printStackTrace();
		}
	}
	return resp;
	}
}
