package com.boardcamp.javaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardcamp.javaapi.model.Customer;
import com.boardcamp.javaapi.dto.CustomerDTO;
import com.boardcamp.javaapi.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer getCustomerById(int id) {
        return repository.findById(id);
    }
}
