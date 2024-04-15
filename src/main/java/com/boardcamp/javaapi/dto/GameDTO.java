package com.boardcamp.javaapi.dto;

import jakarta.validation.constraints.NotBlank;

public record GameDTO(
        @NotBlank String name,
        @NotBlank String image,
        @NotBlank int stockTotal,
        @NotBlank int pricePerDay

) {
}
