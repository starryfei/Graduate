package com.starry.entity;

public class DoctorInfoJson {
	private String dNumber;
	private String dName;
	private String Name;
	private String dTel;
	private String dInfo;
	private String dEmail;
	private String dResume;
	private String img;
	private Integer total;
	private String price;
	private String sTime;
	private String eTime;
	private String cNumber;
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcNumber() {
		return cNumber;
	}
	public String getdNumber() {
		return dNumber;
	}
	public void setdNumber(String dNumber) {
		this.dNumber = dNumber;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getdTel() {
		return dTel;
	}
	public void setdTel(String dTel) {
		this.dTel = dTel;
	}
	public String getdInfo() {
		return dInfo;
	}
	public void setdInfo(String dInfo) {
		this.dInfo = dInfo;
	}
	public String getdEmail() {
		return dEmail;
	}
	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}
	public String getdResume() {
		return dResume;
	}
	public void setdResume(String dResume) {
		this.dResume = dResume;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getTotal() {
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
	@Override
	public String toString() {
		return "DoctorInfoJson [dNumber=" + dNumber + ", dName=" + dName
				+ ", Name=" + Name + ", dTel=" + dTel + ", dInfo=" + dInfo
				+ ", dEmail=" + dEmail + ", dResume=" + dResume + ", img="
				+ img + ", total=" + total + ", price=" + price + ", sTime="
				+ sTime + ", eTime=" + eTime + "]";
	}
	public DoctorInfoJson(String dNumber, String dName, String name,
			String dTel, String dInfo, String dEmail, String dResume,
			String img, Integer total, String price, String sTime, String eTime) {
		super();
		this.dNumber = dNumber;
		this.dName = dName;
		Name = name;
		this.dTel = dTel;
		this.dInfo = dInfo;
		this.dEmail = dEmail;
		this.dResume = dResume;
		this.img = img;
		this.total = total;
		this.price = price;
		this.sTime = sTime;
		this.eTime = eTime;
	}
	public DoctorInfoJson(String dNumber, String cNumber) {
		super();
		this.dNumber = dNumber;
		this.cNumber = cNumber;
	}
	
	
	
}
