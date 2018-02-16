package com.alexjamesmalcolm.reviewsite;

import static org.mockito.Mockito.when;

import java.util.Collection;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewId;
	@Mock
	private Review firstReview;

	private long secondReviewId;
	@Mock
	private Review secondReview;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		when(firstReview.getId()).thenReturn(firstReviewId);
		when(secondReview.getId()).thenReturn(secondReviewId);
	}

	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		
		Collection<Review> result = underTest.findAll();
		
		Assert.assertThat(result, Matchers.containsInAnyOrder(firstReview, secondReview));
	}
}
