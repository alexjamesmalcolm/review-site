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
		String contentOne = "Black Panther is probably the best marvel movie.";
		String contentTwo = "This movie is so bad that its poster's description is actually about another movie.";
		String contentThree = "This movie is all about the kids, which really, isn't that all that matters?";
		String urlOne = "./black-panther.jpg";
		String urlTwo = "./fantastic-four.jpg";
		String urlThree = "./black-cougar.jpg";
		String descriptionOne = "T'Challa, after the death of his father, the King of Wakanda, returns home to the isolated, technologically advanced African nation to succeed to the throne and take his rightful place as king.";
		String descriptionTwo = "Four young outsiders teleport to an alternate and dangerous universe which alters their physical form in shocking ways. The four must learn to harness their new abilities and work together to save Earth from a former friend turned enemy.";
		String descriptionThree = "With police baffled by kidnappings, Black Cougar armed with gadgets and his toy warriors saves the day.";
		String titleOne = "Black Panther";
		String titleTwo = "Fantastic Four (2015)";
		String titleThree = "Black Cougar";
		populateReviewsMap(
				new Review(1L, titleOne, urlOne, "movies", contentOne, descriptionOne, "good", "movie", "super hero"),
				new Review(2L, titleTwo, urlTwo, "movies", contentTwo, descriptionTwo, "bad", "movie", "super hero"),
				new Review(3L, titleThree, urlThree, "movies", contentThree, descriptionThree, "good",
						"better than fantastic four", "movie"));
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
			if (review.getTags().contains(string)) {
				result.add(review);
			}
		}
		return result;
	}

}
