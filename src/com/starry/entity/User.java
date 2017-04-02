package com.starry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	private String name;
	private String pwd;
	private int id;
	private String tel;
	private String info;
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	

	public User() {
	}

	public User(String name, String pwd, int id,String tel, String info) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.id = id;
		this.tel=tel;
		this.info=info;
	}

	@GeneratedValue
	@Id
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + ", id=" + id + ", tel="
				+ tel + ", info=" + info + "]";
	}


}
