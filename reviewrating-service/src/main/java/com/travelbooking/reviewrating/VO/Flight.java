package com.travelbooking.reviewrating.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Flight {

    private Long flightId;
    private String flightName;
    private String flightSource;
    private String flightDestination;
    private String flightTime;

}
