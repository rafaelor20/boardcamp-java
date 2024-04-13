package com.boardcamp.javaapi.model;

import com.boardcamp.javaapi.dto.CustomerDTO;

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
public class Customer {
    public Customer(CustomerDTO data) {
        this.name = data.name();
        this.cpf = data.cpf();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 11, nullable = false)
    private String cpf;
}
