package com.alexjamesmalcolm.reviewsite;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/")
	public String reviews(Model model) {
		Collection<Review> reviews = reviewRepo.findAll();
		model.addAttribute("reviews", reviews);
		return "reviews";
	}

	@RequestMapping("/review")
	public String review(@RequestParam(value = "id") Long id, Model model) {
		Review review = reviewRepo.find(id);
		model.addAttribute("review", review);
		System.out.println(review.getUrl());
		System.out.println(((Review) model.asMap().get("review")).getUrl());
		return "review";
	}
	
	@RequestMapping("/search")
	public String review(@RequestParam(value = "tag") String tag, Model model) {
		Collection<Review> reviews = reviewRepo.search(tag);
		model.addAttribute("reviews", reviews);
		return "reviews";
	}
}
