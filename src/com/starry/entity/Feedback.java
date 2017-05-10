package com.starry.entity;
//import 	java.sql.Timestamp;
public class Feedback {
	private Integer id;
	private String fname;
	private String ftime;
	private String message;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", fname=" + fname + ", ftime=" + ftime
				+ ", message=" + message + "]";
	}
	public Feedback(Integer id, String fname, String ftime, String message) {
		super();
		this.id = id;
		this.fname = fname;
		this.ftime = ftime;
		this.message = message;
	}
	public Feedback(String fname, String ftime, String message) {
		super();
		this.fname = fname;
		this.ftime = ftime;
		this.message = message;
	}
	
	
}
