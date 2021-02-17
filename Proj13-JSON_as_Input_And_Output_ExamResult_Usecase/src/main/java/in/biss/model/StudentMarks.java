package in.biss.model;

public class StudentMarks {
	private int sid;
	private String sname;
	private int eng;
	private int sci;
	private int math;
	public StudentMarks() {
		super();
	}
	public StudentMarks(int sid, String sname, int eng, int sci, int math) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.eng = eng;
		this.sci = sci;
		this.math = math;
	}
	public int getSid() {
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
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "StudentMarks [sid=" + sid + ", sname=" + sname + ", eng=" + eng + ", sci=" + sci + ", math=" + math
				+ "]";
	}
	
}
