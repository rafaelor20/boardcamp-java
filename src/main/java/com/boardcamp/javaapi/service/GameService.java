package com.boardcamp.javaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardcamp.javaapi.model.Game;
import com.boardcamp.javaapi.dto.GameDTO;
import com.boardcamp.javaapi.repository.GameRepository;

@Service
public class GameService {
    @Autowired

    private GameRepository repository;

    public List<Game> get() {
        return repository.findAll();
    }
}
