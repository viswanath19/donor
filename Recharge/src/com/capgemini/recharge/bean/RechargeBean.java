package com.capgemini.recharge.bean;

public class RechargeBean {
	private String name;
	private long mobileno;
	private String planname;
	private String emailid;
	private String status;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Printing Details of Recharge");
		sb.append("Name is: "+name);
		sb.append("Mobile number is: "+mobileno);
		sb.append("Plane name is: "+planname);
		sb.append("Email Id is: "+emailid);
		sb.append("Status of Recharge is: "+status);
		return sb.toString();
		
	}
}
