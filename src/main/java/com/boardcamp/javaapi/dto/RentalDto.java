package com.boardcamp.javaapi.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.Date;

public record RentalDto(
        @NotBlank long customerId,
        @NotBlank long gameId,
        @NotBlank Date rentDate,
        @NotBlank int daysRented,
        @NotBlank Date returnDate,
        @NotBlank int originalPrice,
        @NotBlank int delayFee) {

}
