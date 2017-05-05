package com.starry.entity;

public class Sch {
	private String  sNumber;
	private String dNumber;
	private String  cNumber;
	private Integer total;
	private  String price;
	private String sTime;
	private String eTime;
	public String getsNumber() {
		return sNumber;
	}
	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}
	public String getdNumber() {
		return dNumber;
	}
	public void setdNumber(String dNumber) {
		this.dNumber = dNumber;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String geteTime() {
		return eTime;
	}
	public void seteTime(String eTime) {
		this.eTime = eTime;
	}
	public Sch(String sNumber, String dNumber, String cNumber, Integer total,
			String price, String sTime, String eTime) {
		super();
		this.sNumber = sNumber;
		this.dNumber = dNumber;
		this.cNumber = cNumber;
		this.total = total;
		this.price = price;
		this.sTime = sTime;
		this.eTime = eTime;
	}
	@Override
	public String toString() {
		return "Sch [sNumber=" + sNumber + ", dNumber=" + dNumber
				+ ", cNumber=" + cNumber + ", total=" + total + ", price="
				+ price + ", sTime=" + sTime + ", eTime=" + eTime + "]";
	}
	
	
}
