package com.starry.entity;

import java.util.Date;

import javax.persistence.Entity;
/**
 * @author Administrator
 *
 */
@Entity
public class Schedule {
	private int sNumber;
	private String dNumber;//
	private String cNumber;//
	private int total;
	private String price;
	private Date sTime;
	
	public int getsNumber() {
		return sNumber;
	}
	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}
		public String getdNumber() {
			return dNumber;
		}
	public void setdNumber(String dNumber) {
		this.dNumber = dNumber;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getsTime() {
		return sTime;
	}
	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}
	@Override
	public String toString() {
		return "Schedule [sNumber=" + sNumber + ", dNumber=" + dNumber + ", cNumber="
				+ cNumber + ", total=" + total + ", price=" + price
				+ ", sTime=" + sTime + "]";
	}
	
	
}
