package com.boardcamp.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boardcamp.javaapi.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    Game findByName(String name);
}
