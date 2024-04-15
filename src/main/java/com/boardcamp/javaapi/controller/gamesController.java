package com.boardcamp.javaapi.controller;

import com.boardcamp.javaapi.service.GameService;
import com.boardcamp.javaapi.model.Game;
import com.boardcamp.javaapi.dto.GameDTO;

import jakarta.validation.Valid;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping

public class gamesController {
    @Autowired
    private GameService service;

    @GetMapping("/games")
    public List<Game> get() {
        return service.get();
    }

}
