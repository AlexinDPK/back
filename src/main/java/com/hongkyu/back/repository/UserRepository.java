package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
