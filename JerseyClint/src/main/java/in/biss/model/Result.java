package in.biss.model;

public class Result {
	private String sub;
	private int mark;
	private String grade;
	public Result() {
		super();
	}
	
	public Result(String sub, int mark, String grade) {
		super();
		this.sub = sub;
		this.mark = mark;
		this.grade = grade;
	}

	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Result [sub=" + sub + ", mark=" + mark + ", grade=" + grade + "]";
	}
	
}
