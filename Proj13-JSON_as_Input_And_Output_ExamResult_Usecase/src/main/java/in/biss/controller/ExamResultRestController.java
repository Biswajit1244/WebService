package in.biss.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import in.biss.model.StdResultCard;
import in.biss.model.StudentMarks;
import in.biss.model.StudentResult;

@Path("/result")
public class ExamResultRestController {
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/show")
	public StdResultCard showResult(List<StudentMarks> markList){
		StdResultCard result=new StdResultCard();
		int passCount=0;
		int failCount=0;
		List<StudentResult> res=null;
		Map<String,String> toppers=null;
		
		result.setTotal(markList.size());
		
		res=new ArrayList<StudentResult>();
		for(StudentMarks marks:markList) {
			StudentResult sr=new StudentResult();
			sr.setSid(marks.getSid());
			sr.setSname(marks.getSname());
			sr.setTotal(marks.getEng()+marks.getMath()+marks.getSci());
			if(marks.getEng()<35 || marks.getMath()<35 || marks.getSci()<35) {
				sr.setResult("FAIL");
				failCount++;
			}else {
				sr.setResult("PASS");
				passCount++;
			}
			res.add(sr);
		}//for
		result.setPassCount(passCount);
		result.setFailCount(failCount);
		
		//sort the list
		Collections.sort(res,(o1,o2)-> o2.getTotal()-o1.getTotal());
		toppers=new LinkedHashMap<String, String>();
		toppers.put("Rank1",res.get(0).getSname());
		toppers.put("Rank2",res.get(1).getSname());
		toppers.put("Rank3",res.get(2).getSname());
		result.setToppers(toppers);
		result.setStdResult(res);
		return result;
	}
}
