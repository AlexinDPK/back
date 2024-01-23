package com.hongkyu.back.service;

import com.hongkyu.back.entity.Board;
import com.hongkyu.back.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.List;

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

    public Board getBoard(Integer id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
    }

    // 게시글 수정 기능 추가
    public Board updateBoard(Integer id, Board updatedBoard) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
        board.setTitle(updatedBoard.getTitle());
        board.setContent(updatedBoard.getContent());
        // 기타 변경하고 싶은 필드를 여기에 추가합니다.
        board.setUpdatedAt(LocalDateTime.now()); // 수정 시간 업데이트
        return boardRepository.save(board);
    }

    // 게시글 삭제 기능 추가
    public void deleteBoard(Integer id) {
        boardRepository.deleteById(id);
    }

    // 주간 상위 3 게시물 조회
    public List<Board> getWeeklyTop3() {
        LocalDateTime oneWeekAgo = LocalDateTime.now().minusWeeks(1);
        LocalDateTime now = LocalDateTime.now();
        return boardRepository.findTop3ByWriteDatetimeBetweenOrderByFavoriteCountDesc(oneWeekAgo, now);
    }

    // 최신 게시물 리스트 조회
    public List<Board> getLatestBoardList() {
        return boardRepository.findTop10ByOrderByCreatedAtDesc();
    }

    // 게시물 검색 기능
    public List<Board> searchBoards(String keyword) {
        return boardRepository.findByTitleContaining(keyword);
    }

    // 특정 사용자 게시물 조회
    public List<Board> getUserBoards(String email) {
        return boardRepository.findByWriterEmail(email);
    }

    // 나머지 코드
}
