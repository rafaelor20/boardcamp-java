package com.boardcamp.javaapi.model;

import com.boardcamp.javaapi.dto.GameDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Game {
    public Game(GameDTO data) {
        this.name = data.name();
        this.image = data.image();
        this.stockTotal = data.stockTotal();
        this.pricePerDay = data.pricePerDay();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String image;

    @Column(nullable = false)
    private Long stockTotal;

    @Column(nullable = false)
    private Long pricePerDay;
}
