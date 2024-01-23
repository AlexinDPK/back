package com.hongkyu.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongkyu.back.entity.Favorite;
import com.hongkyu.back.entity.primaryKey.FavoritePk;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, FavoritePk> {

}