package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

}
