package com.starry.entity;

import javax.persistence.Entity;

@Entity
/**
 * π‹¿Ì‘±
 * @author Administrator
 *
 */
public class Administor {
	private String aNumber;
	private String aName;
	private String aPwd;
	private int status;

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaPwd() {
		return aPwd;
	}

	public void setaPwd(String aPwd) {
		this.aPwd = aPwd;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Administor [aNumber=" + aNumber + ", aName=" + aName
				+ ", aPwd=" + aPwd + ", status=" + status + "]";
	}

}
