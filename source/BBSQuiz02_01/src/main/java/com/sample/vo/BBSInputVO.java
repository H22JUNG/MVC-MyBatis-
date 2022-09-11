package com.sample.vo;

import java.util.List;

public class BBSInputVO {
	private int id;
	private String category;
	private String title;
	private String owner;
	private String content;
	private String createDate;
	private List<String> months;
	private String startMonth;
	private String endMonth;
	private String month;
	public BBSInputVO() {
		// TODO Auto-generated constructor stub
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
	public List<String> getMonths() {
		return months;
	}
	public void setMonths(List<String> months) {
		this.months = months;
	}
	public String getStartMonth() {
		return startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}
	public String getEndMonth() {
		return endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
}
