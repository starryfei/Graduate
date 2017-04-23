package com.starry.entity;

public class DoctorInfo {
	private String dNumber;
	private String dName;
	private String Name;
	private String dTel;
	private String dInfo;
	private String dEmail;
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
	public String getcName() {
		return Name;
	}
	public void setcName(String cName) {
		this.Name = cName;
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
	@Override
	public String toString() {
		return "DoctorInfo [dNumber=" + dNumber + ", dName=" + dName
				+ ", cName=" + Name + ", dTel=" + dTel + ", dInfo=" + dInfo
				+ ", dEmail=" + dEmail + "]";
	}
	
	
	
}
