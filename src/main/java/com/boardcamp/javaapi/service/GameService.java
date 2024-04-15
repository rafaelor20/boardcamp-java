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

    public List<Game> getAll() {
        return repository.findAll();
    }

    public void checkName(GameDTO game) {
        if (game.name() == null || game.name().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        Game gameByName = repository.findByName(game.name());
        if (gameByName != null) {
            throw new IllegalArgumentException("Game already exists");
        }
    }

    public void checkGameStock(GameDTO game) {
        if (game.stockTotal() < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
    }

    public void checkGamePrice(GameDTO game) {
        if (game.pricePerDay() < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public Game save(GameDTO game) {
        checkName(game);
        checkGameStock(game);
        checkGamePrice(game);
        Game newGame = new Game(game);
        return repository.save(newGame);
    }
}
