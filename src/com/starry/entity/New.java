package com.starry.entity;

import java.sql.Timestamp;

public class New {
	private Integer id;
	private String title;
	private String content;
	private String time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public New(Integer id, String title, String content, String time) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.time = time;
	}
	@Override
	public String toString() {
		return "New [id=" + id + ", title=" + title + ", content=" + content
				+ ", time=" + time + "]";
	}
	public New(String title, String content, String time) {
		super();
		this.title = title;
		this.content = content;
		this.time = time;
	}
	
	
}
