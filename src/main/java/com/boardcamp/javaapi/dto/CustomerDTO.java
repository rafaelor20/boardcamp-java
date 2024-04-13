package com.boardcamp.javaapi.dto;

import jakarta.validation.constraints.NotBlank;

public class CustomerDTO {
    @NotBlank
    String name;
    @NotBlank
    String cpf;
}
