package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.SearchLog;

@Repository
public interface SearchLogRepository extends JpaRepository<SearchLog, Integer> {

}
