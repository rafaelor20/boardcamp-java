package com.boardcamp.javaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boardcamp.javaapi.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findAll();
}
