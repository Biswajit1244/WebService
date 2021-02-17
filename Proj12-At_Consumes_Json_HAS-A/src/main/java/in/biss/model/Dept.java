package in.biss.model;

public class Dept {
	private String dname;
	private String dcode;
	private Company comp;
	public Dept() {
		super();
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	public Company getComp() {
		return comp;
	}
	public void setComp(Company comp) {
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "Dept [dname=" + dname + ", dcode=" + dcode + ", comp=" + comp + "]";
	}
	
}
