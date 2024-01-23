package com.hongkyu.back.common;

public interface ResponseMessage {
    // 200 성공
    String SUCCESS = "Success.";

    // 400
    // 유효성 검증 실패
    String VALIDATION_FAILED = "Validation Failed.";
    // 중복된 이메일
    String DUPLICATE_EMAIL = "Duplicate email.";
    // 중복된 닉네임
    String DUPLICATE_NICKNAME = "Duplicate nickname.";
    // 중복된 전화번호
    String DUPLICATE_TEL_NUMBER = "Duplicate tel number.";
    // 존재하지 않는 유저
    String NOT_EXISTED_USER = "This user does not exist.";
    // 존재하지 않는 게시물
    String NOT_EXISTED_BOARD = "this board does not exist.";

    // 401
    // 로그인 실패
    String SIGN_IN_FAIL = "Login information mismatch.";
    // 인증 실패
    String AUTHORIZED_FAIL = "Authroization Failed.";

    // 403
    // 권한 없음
    String NO_PERMISSION = "Do not have permissions.";

    // 500
    // 데이터베이스 오류
    String DATEBASE_ERROR = "Database error.";
}
