package com.alexjamesmalcolm.reviewsite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {
	
	@Test
	public void shouldHaveLongId() {
		long id = 345456;
		Review underTest = new Review(id);
		long actual = underTest.getId();
		assertThat(actual, is(id));
	}
	
	@Test
	public void shouldHaveTitle() {
		String title = "Review: Black Panther";
		Review underTest = new Review(34);
		String actual = underTest.getTitle();
		assertThat(actual, is(title));
	}
	
	public void shouldHaveImageUrl() {}
	
	public void shouldHaveReviewCategory() {}
	
	public void shouldHaveContent() {}
	
	public void shouldHaveDescription() {}
	
	public void shouldHaveDate() {}
}
