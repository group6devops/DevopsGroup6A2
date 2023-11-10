package com.travelbooking.reviewrating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelbooking.reviewrating.entity.ReviewAndRating;
import com.travelbooking.reviewrating.service.ReviewAndRatingService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/reviewAndRating")
@Slf4j
public class ReviewAndRatingController {

	@Autowired
    private ReviewAndRatingService reviewAndRatingService;

    @PostMapping("/")
    public ReviewAndRating saveUser(@RequestBody ReviewAndRating reviewAndRating) {
        return reviewAndRatingService.saveUser(reviewAndRating);
    }

    @GetMapping("/{id}")
    public List<ReviewAndRating> getRatingWithFlight(@PathVariable("id") Long flightId) {
        
        return reviewAndRatingService.getReviewByFlight(flightId);
    }
    
    
}
