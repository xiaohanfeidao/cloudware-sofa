package com.sheng.cook4j.data;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SofaData implements Serializable {

	private Long id;
	
	private String title;
	
	private String desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public SofaData(Long id, String title, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "SofaData [id=" + id + ", title=" + title + ", desc=" + desc + "]";
	}

	public SofaData() {
		super();
	}
}
