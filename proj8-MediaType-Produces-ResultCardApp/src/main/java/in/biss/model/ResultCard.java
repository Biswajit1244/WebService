package in.biss.model;

import java.util.List;

public class ResultCard {
	private String stdName;
	private String htNo;
	private String result;
	private int totalMarks;
	private String grade;
	private List<ResultLine> resultLines;
	private String issuedBy;
	private String issuedAt;
	
	
	public ResultCard() {
		super();
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getHtNo() {
		return htNo;
	}
	public void setHtNo(String htNo) {
		this.htNo = htNo;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public List<ResultLine> getResultLines() {
		return resultLines;
	}
	public void setResultLines(List<ResultLine> resultLines) {
		this.resultLines = resultLines;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public String getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(String issuedAt) {
		this.issuedAt = issuedAt;
	}
	@Override
	public String toString() {
		return "ResultCard [stdName=" + stdName + ", htNo=" + htNo + ", result=" + result + ", totalMarks=" + totalMarks
				+ ", grade=" + grade + ", resultLines=" + resultLines + ", issuedBy=" + issuedBy + ", issuedAt="
				+ issuedAt + "]";
	}
	
	
}
