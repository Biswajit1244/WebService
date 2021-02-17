package in.biss.model;

import java.util.List;
import java.util.Map;

public class Contract {
	private Integer cid;
	private String ccode;
	private Double bidAmt;
	private List<String> model;
	private Map<String,String> service;
	public Contract(Integer cid, String ccode, Double bidAmt, List<String> model, Map<String, String> service) {
		super();
		this.cid = cid;
		this.ccode = ccode;
		this.bidAmt = bidAmt;
		this.model = model;
		this.service = service;
	}
	public Contract() {
		super();
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public Double getBidAmt() {
		return bidAmt;
	}
	public void setBidAmt(Double bidAmt) {
		this.bidAmt = bidAmt;
	}
	public List<String> getModel() {
		return model;
	}
	public void setModel(List<String> model) {
		this.model = model;
	}
	public Map<String, String> getService() {
		return service;
	}
	public void setService(Map<String, String> service) {
		this.service = service;
	}
	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", ccode=" + ccode + ", bidAmt=" + bidAmt + ", model=" + model + ", service="
				+ service + "]";
	}
	
	
}
