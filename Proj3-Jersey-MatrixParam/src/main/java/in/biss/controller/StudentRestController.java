package in.biss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/stud")
public class StudentRestController {
	@GET
	public String getExamResult(
			@MatrixParam("sid")int stdId,
			@MatrixParam("sname")String stdName,
			@MatrixParam("eng")int eng,
			@MatrixParam("hin")int hin,
			@MatrixParam("math")int math
			) {
		String result=null;
		int avg=0,total=0;
		String grade=null;
		StringBuilder msg=null;
		if(eng>=35 && hin>=35 && math>=35) {
			result="PASS";
		}else {
			result="FAIL";
		}
		total=eng+hin+math;
		avg=(int)Math.round(total/3.0);
		
	if(result.equals("PASS")) {
		if(avg>=75)
			grade="A+";
		else if(avg>=60 && avg<=74)
			grade="A";
		else if(avg>=45 && avg<=59)
			grade="B";
		else if(avg>=35 && avg<=44)
			grade="C";
	}else {
		grade=null;
	}
	msg=new StringBuilder()
			.append("ID:"+stdId+"\t").append("NAME:-"+stdName+"\n")
			.append("ENG:-"+eng+"\t").append("HIN:-"+hin+"\t").append("ENG:-"+eng+"\n")
			.append("TOTAL:-"+total+"\t").append("AVG:-"+avg+"\n")
			.append("RESULT:-"+result+"\t");
	if(grade!=null) {
		msg.append("GRADE:-"+grade);
	}
		return msg.toString();
	}
}
