package in.biss.model;

import java.util.List;

public class Student {
	private int sid;
	private String sname;
	private List<Result> results;
	public Student() {
		super();
	}
	public int getSid() {
		System.out.println("Student Obj Created");
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", results=" + results + "]";
	}
	
}
