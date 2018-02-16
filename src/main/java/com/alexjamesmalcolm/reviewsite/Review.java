package com.alexjamesmalcolm.reviewsite;

public class Review {

	private long id;
	private String title;
	private String url;

	public Review(long id, String title, String url) {
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

}
