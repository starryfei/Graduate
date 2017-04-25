package com.starry.entity;

public class Count {
	private String dNumber;
	private String name;
	private Double sum;
	private Long count;
	public String getdNumber() {
		return dNumber;
	}
	public void setdNumber(String dNumber) {
		this.dNumber = dNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Count [dNumber=" + dNumber + ", name=" + name + ", sum=" + sum
				+ ", count=" + count + "]";
	}
	public Count(String dNumber, String name, Double sum, Long count) {
		super();
		this.dNumber = dNumber;
		this.name = name;
		this.sum = sum;
		this.count = count;
	}
	

}
