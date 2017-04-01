package com.starry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	private String name;
	private String pwd;
	private int id;

	public User() {
	}

	public User(String name, String pwd, int id) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.id = id;
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
		return "User [name=" + name + ", pwd=" + pwd + ", id=" + id + "]";
	}

}
