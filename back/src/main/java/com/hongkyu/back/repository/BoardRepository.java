package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
