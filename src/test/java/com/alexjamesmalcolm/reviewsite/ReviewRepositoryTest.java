package com.alexjamesmalcolm.reviewsite;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewId = 1L;
	@Mock
	private Review firstReview;

	private long secondReviewId = 2L;
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

		Assert.assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}

	@Test
	public void shouldFindOne() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Review result = underTest.find(firstReviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldSearchByTag() {
		List<String> tags1 = new ArrayList<>();
		tags1.add("stuff");
		tags1.add("good");
		when(firstReview.getTags()).thenReturn(tags1);
		List<String> tags2 = new ArrayList<>();
		tags2.add("good");
		tags2.add("movie");
		when(secondReview.getTags()).thenReturn(tags2);
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.search("stuff");
		assertThat(result, containsInAnyOrder(firstReview));
	}
}
