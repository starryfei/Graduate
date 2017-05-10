package com.starry.entity;

import 	java.sql.Timestamp;


public class OrderInfo {
	private Integer oNumber;
	private String uname;
	private String name;
	
	private String price;
	private String time;
	private Integer status;
	public Integer getoNumber() {
		return oNumber;
	}
	public void setoNumber(Integer oNumber) {
		this.oNumber = oNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public OrderInfo(Integer oNumber,  String uname,String name, String price,
			String time, Integer status) {
		super();
		this.oNumber = oNumber;
		this.name = name;
		this.uname = uname;
		this.price = price;
		this.time = time;
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderInfo [oNumber=" + oNumber + ",uname="+ uname + ", name=" + name + ",  price=" + price + ", time=" + time + ", status="
				+ status + "]";
	}
	
}
