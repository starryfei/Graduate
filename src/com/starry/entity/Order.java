package com.starry.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
/**
 * 订单
 * @author Administrator
 *
 */
public class Order {
	private int oNumber;
	private String sNumber;//上班表
	private int id;//用户
	private Date oTime;
	private String price;
	public int getoNumber() {
		return oNumber;
	}
	public void setoNumber(int oNumber) {
		this.oNumber = oNumber;
	}
	public String getsNumber() {
		return sNumber;
	}
	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getoTime() {
		return oTime;
	}
	public void setoTime(Date oTime) {
		this.oTime = oTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [oNumber=" + oNumber + ", sNumber=" + sNumber
				+ ", id=" + id + ", oTime=" + oTime + ", price=" + price
				+ "]";
	}
	
	
}
