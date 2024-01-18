package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
