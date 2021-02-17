package in.biss.model;

public class StudentResult {
	private int sid;
	private String sname;
	private int total;
	private String result;
	public StudentResult() {
		super();
	}
	public StudentResult(int sid, String sname, int total, String result) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.total = total;
		this.result = result;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "StudentResult [sid=" + sid + ", sname=" + sname + ", total=" + total + ", result=" + result + "]";
	}
	
}
