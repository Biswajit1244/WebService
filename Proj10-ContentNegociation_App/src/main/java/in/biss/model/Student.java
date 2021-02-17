package in.biss.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	private int sid;
	private String sname;
	private double sfee;
	@XmlElementWrapper(name="subjects")
	private List<String> subs;
	private Map<String,Integer> marks;
	private Address addr;
	public Student(int sid, String sname, double sfee, List<String> subs, Map<String, Integer> marks, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.subs = subs;
		this.marks = marks;
		this.addr = addr;
	}
	public Student() {
		super();
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
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public List<String> getSubs() {
		return subs;
	}
	public void setSubs(List<String> subs) {
		this.subs = subs;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", subs=" + subs + ", marks=" + marks
				+ ", addr=" + addr + "]";
	}
	
}
