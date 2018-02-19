package com.alexjamesmalcolm.reviewsite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews;

	public ReviewRepository() {
		populateReviewsMap(
				new Review(1L, "Black Panther", "./black-panther.jpg", "movies", "content1", "description1",
						"good", "movie", "super hero"),
				new Review(2L, "title2", "second url", "category2", "content2", "description2", "good", "stuff"),
				new Review(3L, "title3", "third url", "category3", "content3", "description3", "good", "stuff"));
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		this.reviews = new HashMap<>(reviews.length);
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review find(Long reviewId) {
		return reviews.get(reviewId);
	}

	public Collection<Review> search(String string) {
		Collection<Review> result = new ArrayList<>();
		for (Review review : findAll()) {
			if(review.getTags().contains(string)) {
				result.add(review);
			}
		}
		return result;
	}

}
