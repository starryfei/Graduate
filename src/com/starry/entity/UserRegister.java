package com.starry.entity;

import javax.persistence.Entity;

@Entity
public class UserRegister {
	@Override
	public String toString() {
		return "UserRegister [name=" + name + ", pwd=" + pwd + ", tel=" + tel
				+ ", address=" + address + "]";
	}

	private String name;
	private String pwd;
	private String tel;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UserRegister() {
		// TODO Auto-generated constructor stub
	}

	public UserRegister(String name, String pwd, String tel, String address) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
		this.address = address;
	}

}
