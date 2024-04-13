package com.boardcamp.javaapi.model;

import java.util.Date;
import com.boardcamp.javaapi.dto.RentalDto;

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
public class Rental {

    public Rental(RentalDto data) {
        this.customerId = data.customerId();
        this.gameId = data.gameId();
        this.rentDate = data.rentDate();
        this.daysRented = data.daysRented();
        this.returnDate = data.returnDate();
        this.originalPrice = data.originalPrice();
        this.delayFee = data.delayFee();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long customerId;

    @Column(nullable = false)
    private Long gameId;

    @Column(nullable = false)
    private int rentDate;

    @Column(nullable = false)
    private int daysRented;

    @Column(nullable = false)
    private Date returnDate;

    @Column(nullable = false)
    private int originalPrice;

    @Column(nullable = false)
    private int delayFee;
}
