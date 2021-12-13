package com.iftm.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.ratingsdataservice.models.Rating;
import com.iftm.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 9);
	}

	@RequestMapping("users/{userId}")
	public List<Rating> getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(new Rating("1234", 18), new Rating("1534", 28));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return ratings;
	}
}
