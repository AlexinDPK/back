package com.hongkyu.back.service;

import com.hongkyu.back.entity.Board;
import com.hongkyu.back.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board createBoard(Board board) {
        board.setCreatedAt(LocalDateTime.now()); // 생성 시간 설정
        board.setUpdatedAt(LocalDateTime.now()); // 수정 시간 설정
        return boardRepository.save(board);
    }

    public Board getBoard(Integer id) { // ID 타입을 Integer로 변경
        return boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
    }

    // 나머지 코드
}
