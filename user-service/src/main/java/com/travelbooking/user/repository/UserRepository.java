package com.travelbooking.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelbooking.user.entity.UserInfo;

@Repository
public interface UserRepository  extends JpaRepository<UserInfo,Long> {
    UserInfo findByUserId(Long userId);
}