package com.hongkyu.back.controller;

import com.hongkyu.back.entity.Board;
import com.hongkyu.back.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 게시글 생성
    @PostMapping
    public ResponseEntity<?> createBoard(@RequestBody Board board) {
        Board newBoard = boardService.createBoard(board);
        return ResponseEntity.ok(newBoard);
    }

    // 게시글 수정 기능 - PATCH 요청으로 게시글의 일부 내용을 변경
    @PatchMapping("/{id}")
    public ResponseEntity<?> updateBoard(@PathVariable Integer id, @RequestBody Board updatedBoard) {
        Board board = boardService.updateBoard(id, updatedBoard);
        return ResponseEntity.ok(board);
    }

    // 게시글 삭제 기능 - DELETE 요청으로 게시글을 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable Integer id) {
        boardService.deleteBoard(id);
        return ResponseEntity.ok().build();
    }

    // 게시글 조회 (특정 ID에 해당하는 게시글)
    @GetMapping("/{id}")
    public ResponseEntity<?> getBoard(@PathVariable Integer id) {
        Board board = boardService.getBoard(id);
        return ResponseEntity.ok(board);
    }

    // 주간 상위 3 게시물 조회 기능 추가
    @GetMapping("/weekly-top-3")
    public ResponseEntity<?> getWeeklyTop3() {
        List<Board> top3Boards = boardService.getWeeklyTop3();
        return ResponseEntity.ok(top3Boards);
    }

    // 최신 게시물 리스트 조회 기능 추가
    @GetMapping("/latest")
    public ResponseEntity<?> getLatestBoards() {
        List<Board> latestBoards = boardService.getLatestBoardList();
        return ResponseEntity.ok(latestBoards);
    }

    // 게시물 검색 기능 추가
    @GetMapping("/search/{keyword}")
    public ResponseEntity<?> searchBoards(@PathVariable String keyword) {
        List<Board> searchResults = boardService.searchBoards(keyword);
        return ResponseEntity.ok(searchResults);
    }

    // 특정 사용자 게시물 조회 기능 추가
    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUserBoards(@PathVariable String email) {
        List<Board> userBoards = boardService.getUserBoards(email);
        return ResponseEntity.ok(userBoards);
    }

    // 게시글 수정, 삭제 등의 엔드포인트 추가
    // 이 부분은 추가적인 요구사항에 따라 구현될 수 있습니다.
}
