package com.alexjamesmalcolm.reviewsite;

public class Review {

	private long id;

	public Review(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return "Review: Black Panther";
	}

}
