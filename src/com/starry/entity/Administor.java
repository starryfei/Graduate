package com.starry.entity;

import javax.persistence.Entity;

@Entity
/**
 * @author Administrator
 *
 */
public class Administor {
	@Override
	public String toString() {
		return "Administor [aNumber=" + aNumber + ", Name=" + Name + ", Pwd="
				+ Pwd + ", status=" + status + "]";
	}

	private String aNumber;
	private String Name;
	private String Pwd;
	private int status;//

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}


}
