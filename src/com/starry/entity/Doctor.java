package com.starry.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
/**
 * @author Administrator
 *
 */
public class Doctor {
	private String dNumber;
	private String dName;
	private String dPwd;
	private String cNumber;
	private String dInfo;
	private String dResume;
	private String dTel;
	private String dEmail;
	private String image;
	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
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

	public String getdPwd() {
		return dPwd;
	}

	public void setdPwd(String dPwd) {
		this.dPwd = dPwd;
	}


	public String getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}

	public String getdInfo() {
		return dInfo;
	}

	public void setdInfo(String dInfo) {
		this.dInfo = dInfo;
	}

	public String getdResume() {
		return dResume;
	}

	public void setdResume(String dResume) {
		this.dResume = dResume;
	}

	public String getdTel() {
		return dTel;
	}

	public void setdTel(String dTel) {
		this.dTel = dTel;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public Doctor(String dNumber, String dName, String dPwd, String cNumber,
			String dInfo, String dResume, String dTel, String dEmail, String image) {
		super();
		this.dNumber = dNumber;
		this.dName = dName;
		this.dPwd = dPwd;
		this.cNumber = cNumber;
		this.dInfo = dInfo;
		this.dResume = dResume;
		this.dTel = dTel;
		this.dEmail = dEmail;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Doctor [dNumber=" + dNumber + ", dName=" + dName + ", dPwd="
				+ dPwd + ", cNumber=" + cNumber + ", dInfo=" + dInfo
				+ ", dResume=" + dResume + ", dTel=" + dTel + "]";
	}



}
