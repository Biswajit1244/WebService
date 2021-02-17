package in.biss.model;

public class Company {
	private int cid;
	private String code;
	private String regNum;
	private String owner;
	public Company() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", code=" + code + ", regNum=" + regNum + ", owner=" + owner + "]";
	}
	
	
}
