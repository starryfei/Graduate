package com.starry.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
/**
 * @author Administrator
 *
 */
public class Order {
	private Integer oNumber;
	private String sNumber;
	private Integer id;
	private String oTime;
	private String price;
	private Integer status;
	public Integer getoNumber() {
		return oNumber;
	}
	public void setoNumber(Integer oNumber) {
		this.oNumber = oNumber;
	}
	public String getsNumber() {
		return sNumber;
	}
	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getoTime() {
		return oTime;
	}
	public void setoTime(String oTime) {
		this.oTime = oTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Order [oNumber=" + oNumber + ", sNumber=" + sNumber
				+ ", id=" + id + ", oTime=" + oTime + ", price=" + price
				+ "]";
	}
	public Order(String sNumber, Integer id, String oTime,
			String price,Integer status) {
		super();
//		this.oNumber = oNumber;
		this.sNumber = sNumber;
		this.id = id;
		this.oTime = oTime;
		this.price = price;
		this.status = status;
	}
	
	
}
