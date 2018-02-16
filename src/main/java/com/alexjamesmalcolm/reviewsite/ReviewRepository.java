package com.alexjamesmalcolm.reviewsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Collection<Review> reviews;

	public ReviewRepository(Review... reviews) {
		this.reviews = new ArrayList<Review>(reviews.length);
		this.reviews.addAll(Arrays.asList(reviews));
	}

	public Collection<Review> findAll() {
		return reviews;
	}

}
