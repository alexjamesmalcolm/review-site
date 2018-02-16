package com.alexjamesmalcolm.reviewsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Review {

	private long id;
	private String title;
	private String url;
	private String category;
	private String content;
	private String description;
	private Date date;
	private List<String> tags;

	public Review(long id, String title, String url, String category, String content, String description, Date date,
			String... tags) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.category = category;
		this.content = content;
		this.description = description;
		this.date = date;
		this.tags = new ArrayList<String>(tags.length);
		this.tags.addAll(Arrays.asList(tags));
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDescription() {
		return description;
	}

	public Date getDate() {
		return date;
	}

	public List<String> getTags() {
		return tags;
	}

}
