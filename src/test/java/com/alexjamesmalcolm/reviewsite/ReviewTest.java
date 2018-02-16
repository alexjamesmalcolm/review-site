package com.alexjamesmalcolm.reviewsite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {

	@Test
	public void shouldHaveLongId() {
		long id = 345456;
		Review underTest = new Review(id, "", "", "movies");
		long actual = underTest.getId();
		assertThat(actual, is(id));
	}

	@Test
	public void shouldHaveTitle() {
		String title = "Review: Black Panther";
		Review underTest = new Review(34, title, "", "movies");
		String actual = underTest.getTitle();
		assertThat(actual, is(title));
	}

	@Test
	public void shouldHaveId2() {
		long id = 2;
		Review underTest = new Review(id, "", "", "movies");
		long actual = underTest.getId();
		assertThat(actual, is(id));
	}

	@Test
	public void shouldHaveTitle2() {
		String title = "2";
		Review underTest = new Review(1, title, "", "movies");
		String actual = underTest.getTitle();
		assertThat(actual, is(title));
	}

	@Test
	public void shouldHaveImageUrl() {
		String url = "http://cdn.history.com/sites/2/2018/02/MCDBLPA_EC092-1-E.jpeg";
		Review underTest = new Review(1, "", url, "movies");
		String actual = underTest.getUrl();
		assertThat(actual, is(url));
	}

	@Test
	public void shouldHaveImageUrl2() {
		String url = "https://images-na.ssl-images-amazon.com/images/"
				+ "M/MV5BMTg1MTY2MjYzNV5BMl5BanBnXkFtZTgwMTc4NTMwNDI@._V1_UY1200_CR90,0,630,1200_AL_.jpg";
		Review underTest = new Review(1, "", url, "movies");
		String actual = underTest.getUrl();
		assertThat(actual, is(url));
	}

	@Test
	public void shouldHaveReviewCategory() {
		String category = "movies";
		Review underTest = new Review(1, "", "", "movies");
		String actual = underTest.getCategory();
		assertThat(actual, is(category));
	}

	public void shouldHaveContent() {
	}

	public void shouldHaveDescription() {
	}

	public void shouldHaveDate() {
	}
}
