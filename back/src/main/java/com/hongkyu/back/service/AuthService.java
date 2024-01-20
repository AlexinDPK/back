package com.hongkyu.back.service;

import org.springframework.http.ResponseEntity;

import com.hongkyu.back.dto.request.auth.IdCheckRequestDto;
import com.hongkyu.back.dto.response.auth.IdCheckResponseDto;
import com.hongkyu.back.dto.request.auth.SignInRequestDto;
import com.hongkyu.back.dto.request.auth.SignUpRequestDto;
import com.hongkyu.back.dto.response.auth.SignInResponseDto;
import com.hongkyu.back.dto.response.auth.SignUpResponseDto;

public interface AuthService {

    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);

    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);

    ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);
}
