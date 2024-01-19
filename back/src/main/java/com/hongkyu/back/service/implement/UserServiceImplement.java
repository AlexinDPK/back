package com.hongkyu.back.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hongkyu.back.dto.response.ResponseDto;
import com.hongkyu.back.dto.response.user.GetSignInUserResponseDto;
import com.hongkyu.back.entity.User;
import com.hongkyu.back.repository.UserRepository;
import com.hongkyu.back.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email) {

        User user = null;

        try {

            user = userRepository.findByEmail(email);
            if (user == null)
                return GetSignInUserResponseDto.notExistUser();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }
        return GetSignInUserResponseDto.success(user);
    }

}
