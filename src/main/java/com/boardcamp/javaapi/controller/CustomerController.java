package com.boardcamp.javaapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort.Path;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

import com.boardcamp.javaapi.model.Customer;
import com.boardcamp.javaapi.dto.CustomerDTO;
import com.boardcamp.javaapi.service.CustomerService;

@RestController
@RequestMapping

public class CustomerController {
    @Autowired

    private CustomerService service;

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> get(@PathVariable Long id) {
        Customer customer = service.getCustomerById(id);
        return ResponseEntity.status(200).body(customer);
    }
}
