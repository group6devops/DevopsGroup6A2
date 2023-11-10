package com.travelbooking.reviewrating.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelbooking.reviewrating.entity.ReviewAndRating;

@Repository
public interface ReviewAndRatingRepository extends JpaRepository<ReviewAndRating, Long> {
	
	List<ReviewAndRating> findByFlightId(Long flightId);


}
