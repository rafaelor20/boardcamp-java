package com.boardcamp.javaapi.dto;

import jakarta.validation.constraints.NotBlank;

public record CustomerDTO(
        @NotBlank String name,
        @NotBlank String cpf) {
}
