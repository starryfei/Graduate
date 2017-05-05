package com.starry.entity;

public class DepartmentInfo {
	private String cNumber;
	private String dName;
	private String dNumber;
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdNumber() {
		return dNumber;
	}
	public void setdNumber(String dNumber) {
		this.dNumber = dNumber;
	}
	public DepartmentInfo(String cNumber, String dName, String dNumber) {
		super();
		this.cNumber = cNumber;
		this.dName = dName;
		this.dNumber = dNumber;
	}
	@Override
	public String toString() {
		return "DepartmentInfo [cNumber=" + cNumber + ", dName=" + dName
				+ ", dNumber=" + dNumber + "]";
	}
	
	
	
}
