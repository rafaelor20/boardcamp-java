package com.boardcamp.javaapi.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.Date;

public class RentalDto {
    @NotBlank
    int customerId;
    @NotBlank
    int gameId;
    @NotBlank
    Date rentDate;
    @NotBlank
    int daysRented;
    @NotBlank
    Date returnDate;
    @NotBlank
    int originalPrice;
    @NotBlank
    int delayFee;
}
