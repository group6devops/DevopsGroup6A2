package com.travelbooking.reviewrating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.travelbooking.reviewrating.VO.Flight;
import com.travelbooking.reviewrating.VO.ResponseTemplateVO;
import com.travelbooking.reviewrating.entity.ReviewAndRating;
import com.travelbooking.reviewrating.repository.ReviewAndRatingRepository;



@Service
public class ReviewAndRatingService {

    @Autowired
    private ReviewAndRatingRepository reviewAndRatingRepository;
    
    @Autowired
    private RestTemplate restTemplate;

    public ReviewAndRating saveUser(ReviewAndRating reviewAndRating) {
     
        return reviewAndRatingRepository.save(reviewAndRating);
    }

    public List getReviewByFlight(Long flightId) {
    	
    	List r = reviewAndRatingRepository.findByFlightId(flightId);
    	r.add(getFlightDetails(flightId));
    	return r;
    }
    
    public ResponseTemplateVO getFlightDetails(Long flightId) {
    	ResponseTemplateVO vo = new ResponseTemplateVO();
    	
    	Flight flight =
                restTemplate.getForObject("http://localhost:9001/flights/" + flightId
                        ,Flight.class);
        
        vo.setFlight(flight);
    	
    	return vo;
    	
    }
    
        
}
