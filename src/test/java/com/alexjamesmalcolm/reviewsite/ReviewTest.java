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
}
