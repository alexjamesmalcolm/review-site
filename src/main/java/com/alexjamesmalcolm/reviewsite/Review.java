package com.alexjamesmalcolm.reviewsite;

public class Review {

	private long id;
	private String title;
	private String url;
	private String category;
	private String content;

	public Review(long id, String title, String url, String category, String content, String description) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.category = category;
		this.content = content;
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
		return "Good review of good movie";
	}

}
