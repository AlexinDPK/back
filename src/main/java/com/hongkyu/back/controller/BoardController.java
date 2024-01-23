package com.hongkyu.back.controller;

import com.hongkyu.back.entity.Board;
import com.hongkyu.back.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public ResponseEntity<?> createBoard(@RequestBody Board board) {
        Board newBoard = boardService.createBoard(board); // 게시글 생성 요청 처리 // KYJ
        return ResponseEntity.ok(newBoard); // 생성된 게시글 반환 // KYJ
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getBoard(@PathVariable Integer id) { // Long 대신 Integer 사용
        Board board = boardService.getBoard(id); // 게시글 조회 요청 처리 // KYJ
        return ResponseEntity.ok(board); // 조회된 게시글 반환 // KYJ
    }

    // 게시글 수정, 삭제 등의 엔드포인트 추가
}
