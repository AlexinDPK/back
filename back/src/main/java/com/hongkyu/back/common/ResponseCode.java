package com.hongkyu.back.common;

public interface ResponseCode {

    // 200 성공
    String SUCCESS = "SU";

    // 400
    // 유효성 검증 실패
    String VALIDATION_FAILED = "VF";
    // 중복된 이메일
    String DUPLICATE_EMAIL = "DE";
    // 중복된 닉네임
    String DUPLICATE_NICKNAME = "DN";
    // 중복된 전화번호
    String DUPLICATE_TEL_NUMBER = "DT";
    // 존재하지 않는 유저
    String NOT_EXISTED_USER = "NU";
    // 존재하지 않는 게시물
    String NOT_EXISTED_BOARD = "NB";

    // 401
    // 로그인 실패
    String SIGN_IN_FAIL = "SF";
    // 인증 실패
    String AUTHORIZED_FAIL = "AF";

    // 403
    // 권한 없음
    String NO_PERMISSION = "NP";

    // 500
    // 데이터베이스 오류
    String DATEBASE_ERROR = "DBE";

}
