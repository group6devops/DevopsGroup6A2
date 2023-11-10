package com.travelbooking.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.travelbooking.user.VO.Flight;
import com.travelbooking.user.VO.ResponseTemplateVO;
import com.travelbooking.user.entity.UserInfo;
import com.travelbooking.user.repository.UserRepository;


@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public UserInfo saveUser(UserInfo userInfo) {
     
        return userRepository.save(userInfo);
    }

    public ResponseTemplateVO getUserWithFlight(Long userId) {
       
        ResponseTemplateVO vo = new ResponseTemplateVO();
        UserInfo userInfo = userRepository.findByUserId(userId);

        Flight flight =
                restTemplate.getForObject("http://localhost:9001/flights/" + userInfo.getFlightId()
                        ,Flight.class);
        
        vo.setUser(userInfo);
        vo.setFlight(flight);

        return  vo;
    }
}