package com.sample.vo;

public class BBSVO2 {
	private int id;
	private String title;
	private String owner;
	private String content;
	private String date;
	private String time;
	public BBSVO2() {
		// TODO Auto-generated constructor stub
	}
	
	public BBSVO2(int id, String title, String owner, String content, String date, String time) {
		super();
		this.id = id;
		this.title = title;
		this.owner = owner;
		this.content = content;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
