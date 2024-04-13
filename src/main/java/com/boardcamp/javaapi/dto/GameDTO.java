package com.boardcamp.javaapi.dto;

import jakarta.validation.constraints.NotBlank;

public class GameDTO {
    @NotBlank
    String name;
    @NotBlank
    String image;
    @NotBlank
    int stockTotal;
    @NotBlank
    int pricePerDay;
}
