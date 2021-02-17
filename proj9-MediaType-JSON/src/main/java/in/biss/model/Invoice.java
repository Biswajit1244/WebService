package in.biss.model;

public class Invoice {
	private Integer code;
	private String vendor;
	private Double cost;
	public Invoice(Integer code, String vendor, Double cost) {
		super();
		this.code = code;
		this.vendor = vendor;
		this.cost = cost;
	}
	public Invoice() {
		super();
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Invoice [code=" + code + ", vendor=" + vendor + ", cost=" + cost + "]";
	}
	
	
}
