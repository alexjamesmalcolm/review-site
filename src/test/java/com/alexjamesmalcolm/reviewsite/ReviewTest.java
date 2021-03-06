package com.alexjamesmalcolm.reviewsite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReviewTest {

	@Test
	public void shouldHaveLongId() {
		long id = 345456;
		Review underTest = new Review(id, "", "", "movies", "Hello world", "");
		long actual = underTest.getId();
		assertThat(actual, is(id));
	}

	@Test
	public void shouldHaveTitle() {
		String title = "Review: Black Panther";
		Review underTest = new Review(34, title, "", "movies", "Hello world", "");
		String actual = underTest.getTitle();
		assertThat(actual, is(title));
	}

	@Test
	public void shouldHaveId2() {
		long id = 2;
		Review underTest = new Review(id, "", "", "movies", "Hello world", "");
		long actual = underTest.getId();
		assertThat(actual, is(id));
	}

	@Test
	public void shouldHaveTitle2() {
		String title = "2";
		Review underTest = new Review(1, title, "", "movies", "Hello world", "");
		String actual = underTest.getTitle();
		assertThat(actual, is(title));
	}

	@Test
	public void shouldHaveImageUrl() {
		String url = "http://cdn.history.com/sites/2/2018/02/MCDBLPA_EC092-1-E.jpeg";
		Review underTest = new Review(1, "", url, "movies", "Hello world", "");
		String actual = underTest.getUrl();
		assertThat(actual, is(url));
	}

	@Test
	public void shouldHaveImageUrl2() {
		String url = "https://images-na.ssl-images-amazon.com/images/"
				+ "M/MV5BMTg1MTY2MjYzNV5BMl5BanBnXkFtZTgwMTc4NTMwNDI@._V1_UY1200_CR90,0,630,1200_AL_.jpg";
		Review underTest = new Review(1, "", url, "movies", "Hello world", "");
		String actual = underTest.getUrl();
		assertThat(actual, is(url));
	}

	@Test
	public void shouldHaveReviewCategory() {
		String category = "movies";
		Review underTest = new Review(1, "", "", "movies", "Hello world", "");
		String actual = underTest.getCategory();
		assertThat(actual, is(category));
	}

	@Test
	public void shouldHaveReviewCategoryMusic() {
		String category = "music";
		Review underTest = new Review(1, "", "", category, "Hello world", "");
		String actual = underTest.getCategory();
		assertThat(actual, is(category));
	}

	@Test
	public void shouldHaveContent() {
		String content = "Hello world";
		Review underTest = new Review(1, "", "", "", content, "");
		String actual = underTest.getContent();
		assertThat(actual, is(content));
	}

	@Test
	public void shouldHaveContentReview() {
		String content = "review";
		Review underTest = new Review(1, "", "", "", content, "");
		String actual = underTest.getContent();
		assertThat(actual, is(content));
	}

	@Test
	public void shouldHaveDescription() {
		String description = "Good review of good movie";
		Review underTest = new Review(1, "", "", "", "", description);
		String actual = underTest.getDescription();
		assertThat(actual, is(description));
	}

	@Test
	public void shouldHaveDescription2() {
		String description = "2";
		Review underTest = new Review(1, "", "", "", "", description);
		String actual = underTest.getDescription();
		assertThat(actual, is(description));
	}

	@Test
	public void shouldHaveTags() {
		List<String> tags = new ArrayList<>();
		tags.add("movie");
		tags.add("sick");
		tags.add("superhero");
		Review underTest = new Review(1, "", "", "", "", "", "movie", "sick", "superhero");
		List<String> actual = underTest.getTags();
		assertThat(actual, is(tags));
	}
}
