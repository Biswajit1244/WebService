package in.biss.model;

public class Project {
	private int pid;
	private String pname;
	private String client;
	private double cost;
	public Project() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", client=" + client + ", cost=" + cost + "]";
	}
	
	
}
