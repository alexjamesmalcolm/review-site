package com.alexjamesmalcolm.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews;

	public ReviewRepository(Review... reviews) {
		this.reviews = new HashMap<>(reviews.length);
		for(Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review find(Long reviewId) {
		return reviews.get(reviewId);
	}

}
