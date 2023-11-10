package com.travelbooking.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.travelbooking.user.VO.ResponseTemplateVO;
import com.travelbooking.user.entity.UserInfo;
import com.travelbooking.user.service.UserService;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserInfo saveUser(@RequestBody UserInfo userInfo) {
        return userService.saveUser(userInfo);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithFlight(@PathVariable("id") Long userId) {
        
        return userService.getUserWithFlight(userId);
    }


}