package com.boardcamp.javaapi.controller;

import com.boardcamp.javaapi.service.GameService;
import com.boardcamp.javaapi.model.Game;
import com.boardcamp.javaapi.dto.GameDTO;

import jakarta.validation.Valid;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping

public class GamesController {
    @Autowired
    private GameService service;

    @GetMapping("/games")
    public ResponseEntity<List<Game>> getAll() {
        List<Game> games = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(games);
    }

    @PostMapping("/games")
    public ResponseEntity<Game> createGame(@Valid @RequestBody GameDTO game) {
        Game newGame = service.save(game);
        return ResponseEntity.status(HttpStatus.CREATED).body(newGame);
    }

}
