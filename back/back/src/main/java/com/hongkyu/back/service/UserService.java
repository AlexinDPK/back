package com.hongkyu.back.service;

import org.springframework.http.ResponseEntity;

import com.hongkyu.back.dto.response.user.GetSignInUserResponseDto;

public interface UserService {

    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);

}
