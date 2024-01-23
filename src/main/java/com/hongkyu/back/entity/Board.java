package com.hongkyu.back.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity(name = "board")
@Table(name = "board")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNumber;

    private String title;
    private String content;

    @Column
    private LocalDateTime writeDatetime; // 날짜 및 시간 정보를 다루기 위해 LocalDateTime 사용 // KYJ

    private int favoriteCount;
    private int commentCount;
    private int viewCount;
    private String writerEmail;

    // 필요에 따라 다른 필드 및 관계를 추가할 수 있음
    private LocalDateTime createdAt; // 생성 시간 필드
    private LocalDateTime updatedAt; // 수정 시간 필드

    // 생성자, getter, setter
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // 사용자 엔티티와의 관계 설정 (예: 게시글 작성자)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // User 클래스는 별도로 정의되어야 합니다.

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}