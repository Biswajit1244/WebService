package in.biss.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import in.biss.model.ResultCard;
import in.biss.model.ResultLine;

@Path("/result")
public class ResultCardRestController {
	@Produces("application/json")
	@GET
	public ResultCard printCardInfo(
			@QueryParam("sname")String sname,
			@QueryParam("eng")int eng,
			@QueryParam("mat")int mat,
			@QueryParam("sci")int sci)
	{
		String grade=null;
		String ht=UUID.randomUUID()
				.toString()
				.replaceAll("-", "")
				.substring(0,6)
				.toUpperCase();
		ResultCard rs=new ResultCard();
		rs.setStdName(sname);
		rs.setHtNo(ht);
		rs.setTotalMarks(eng+mat+sci);
		rs.setIssuedBy("Naresh IT Education-HYD");
		rs.setResultLines(
				List.of(
						new ResultLine("ENG",eng,eng>=35?"PASS":"FAIL"),
						new ResultLine("MAT",mat,mat>=35?"PASS":"FAIL"),
						new ResultLine("SCI",sci,sci>=35?"PASS":"FAIL")
						)
				);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String dte=sdf.format(new Date(System.currentTimeMillis()));
		rs.setIssuedAt(dte);
		rs.setResult("PASS");
		
		for(ResultLine rl:rs.getResultLines()) {
			if(rl.getResult().equals("FAIL")) {
				rs.setResult("FAIL");
				break;
			}
		}
		if(rs.getResult().equals("PASS")) {
			double avg=(eng+mat+sci)/3.0;
			if(avg>=70) grade="A";
			else if(avg<70 && avg>=60) grade="B";
			else if(avg<60 && avg>=35) grade="C";
		}else {
			grade="-NA-";
		}
		rs.setGrade(grade);
		
		return rs;
  }
}
