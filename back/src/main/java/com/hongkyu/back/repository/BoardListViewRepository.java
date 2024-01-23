package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.BoardListView;

@Repository
public interface BoardListViewRepository extends JpaRepository<BoardListView, Integer> {

}