package com.starry.entity;

public class Jsondoctor {
//doctor.dNumber,department.dName,doctor.name,doctor.dInfo,doctor.image
	private String dNumber;
	private String dName;
	private String name;
	private String dInfo;
	private String img;
	private String sTime;
	private String eTime;
	
	public Jsondoctor(String sTime, String eTime) {
		super();
		this.sTime = sTime;
		this.eTime = eTime;
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
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdInfo() {
		return dInfo;
	}
	public void setdInfo(String dInfo) {
		this.dInfo = dInfo;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Jsondoctor(String dNumber, String dName, String name, String dInfo,
			String img) {
		super();
		this.dNumber = dNumber;
		this.dName = dName;
		this.name = name;
		this.dInfo = dInfo;
		this.img = img;
	}
	@Override
	public String toString() {
		return "Jsondoctor [dNumber=" + dNumber + ", dName=" + dName
				+ ", name=" + name + ", dInfo=" + dInfo + ", img=" + img + "]";
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
	
	
}
