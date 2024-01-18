package com.hongkyu.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "message")
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue
    private int id;

    private String content;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "room_number", nullable = false)
    private ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name = "email", nullable = false)
    private User user;
}
