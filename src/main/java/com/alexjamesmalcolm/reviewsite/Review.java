package com.alexjamesmalcolm.reviewsite;

import java.util.Date;

public class Review {

	private long id;
	private String title;
	private String url;
	private String category;
	private String content;
	private String description;
	private Date date;

	public Review(long id, String title, String url, String category, String content, String description, Date date) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.category = category;
		this.content = content;
		this.description = description;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDescription() {
		return description;
	}

	public Date getDate() {
		return date;
	}

}
