package com.sample.vo;

import org.apache.ibatis.type.Alias;

@Alias("bbsvo1")
public class BBSVO1 {
	private int id;
	private String title;
	private String owner;
	private String content;
	private String createDate;
	
	public BBSVO1() {
		// TODO Auto-generated constructor stub
	}
	
	public BBSVO1(int id, String title, String owner, String content, String createDate) {
		this.id = id;
		this.title = title;
		this.owner = owner;
		this.content = content;
		this.createDate = createDate;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
	
}
