package com.hongkyu.back.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter // 게시글 수정을 위해 Setter 추가 // KYJ
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "board")
@Table(name = "board")
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
}