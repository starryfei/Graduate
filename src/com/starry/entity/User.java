package com.starry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
/**
 * @author Administrator
 *
 */
public class User {
	private String uname;
	private String pwd;
	private Integer id;
	private String tel;
	private String info;
//	private String status;
	
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

	public User(String uname, String pwd, String tel, String info) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.tel=tel;
		this.info=info;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUname() {
		return uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", id=" + id + ", tel="
				+ tel + ", info=" + info + "]";
	}

	public User(String uname, String pwd, Integer id, String tel, String info) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.id = id;
		this.tel = tel;
		this.info = info;
	}


}
