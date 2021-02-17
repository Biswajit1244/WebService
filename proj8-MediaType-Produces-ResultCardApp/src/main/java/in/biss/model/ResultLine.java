package in.biss.model;

public class ResultLine {
	private String subject;
	private int marks;
	private String result;
	public ResultLine(String subject, int marks, String result) {
		super();
		this.subject = subject;
		this.marks = marks;
		this.result = result;
	}
	public ResultLine() {
		super();
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "ResultLine [subject=" + subject + ", marks=" + marks + ", result=" + result + "]";
	}
	
}
