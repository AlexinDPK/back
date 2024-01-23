package com.hongkyu.back.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 아이디 중복 체크
@Getter
@Setter
@NoArgsConstructor
public class IdCheckRequestDto {

    @NotBlank
    private String id;

}
