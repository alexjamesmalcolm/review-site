package com.alexjamesmalcolm.reviewsite;

public class Review {

	private long id;
	private String title;
	private String url;

	public Review(long id, String title, String url, String category) {
		this.id = id;
		this.title = title;
		this.url = url;
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
		return "movies";
	}

}
