package com.my.flutter_coding_boot.vo;


public class Todo {
	private int tood_idx=0;
	private String type=null;
	private String title =null;
	private String created_date=null;
	
	
	public int getTood_idx() {
		return tood_idx;
	}
	public void setTood_idx(int tood_idx) {
		this.tood_idx = tood_idx;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
}
