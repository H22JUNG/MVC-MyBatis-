package com.sample.vo;

public class BBSOutputVO {
	private int id;
	private String category;
	private String title;
	private String owner;
	private String content;
	private String createDate;
	public BBSOutputVO() {
		// TODO Auto-generated constructor stub
	}
	public BBSOutputVO(int id, String category, String title, String owner, String content, String createDate) {
		super();
		this.id = id;
		this.category = category;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
