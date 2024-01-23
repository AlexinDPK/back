package com.hongkyu.back.service;

import org.springframework.http.ResponseEntity;

import com.hongkyu.back.dto.request.board.PostBoardRequestDto;
import com.hongkyu.back.dto.response.board.PostBoardResponseDto;

public interface BoardService {
    ResponseEntity<PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);
}
