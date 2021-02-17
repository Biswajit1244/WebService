package in.biss.model;

import java.util.List;
import java.util.Map;

public class StdResultCard {
	private int total;
	private int passCount;
	private int failCount;
	private Map<String,String> toppers;
	private List<StudentResult> stdResult;
	public StdResultCard() {
		super();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPassCount() {
		return passCount;
	}
	public void setPassCount(int passCount) {
		this.passCount = passCount;
	}
	public int getFailCount() {
		return failCount;
	}
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}
	public Map<String, String> getToppers() {
		return toppers;
	}
	public void setToppers(Map<String, String> toppers) {
		this.toppers = toppers;
	}
	public List<StudentResult> getStdResult() {
		return stdResult;
	}
	public void setStdResult(List<StudentResult> stdResult) {
		this.stdResult = stdResult;
	}
	@Override
	public String toString() {
		return "StdResultCard [total=" + total + ", passCount=" + passCount + ", failCount=" + failCount + ", toppers="
				+ toppers + ", stdResult=" + stdResult + "]";
	}
	
}
