package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hongkyu.back.entity.Board;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

    // 최근 일주일 동안 가장 많이 좋아요를 받은 상위 3개 게시물 조회
    List<Board> findTop3ByWriteDatetimeBetweenOrderByFavoriteCountDesc(LocalDateTime start, LocalDateTime end);

    // 최신 게시물 10개 조회
    List<Board> findTop10ByOrderByCreatedAtDesc();

    // 제목을 기반으로 검색
    List<Board> findByTitleContaining(String title);

    // 특정 사용자가 작성한 게시물 조회
    List<Board> findByWriterEmail(String email);
}
