package com.alexjamesmalcolm.reviewsite;

public class Review {

	private long id;
	private String title;

	public Review(long id, String title) {
		this.id = id;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return null;
	}

}
