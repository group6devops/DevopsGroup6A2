package com.travelbooking.reviewrating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ReviewAndRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewRatingId;
	private String review;
	private int rating;
	private Long flightId;
	private Long userId;
}
