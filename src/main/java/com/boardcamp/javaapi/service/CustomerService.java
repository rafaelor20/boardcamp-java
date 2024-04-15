package com.boardcamp.javaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardcamp.javaapi.dto.CustomerDTO;
import com.boardcamp.javaapi.model.Customer;
import com.boardcamp.javaapi.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer getCustomerById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public boolean customerExists(Long id) {
        return repository.existsById(id);
    }

    public boolean validCpf(String cpf) {
        if (cpf.length() != 11) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validName(String name) {
        if (name.length() < 3 || name.length() > 100) {
            return false;
        } else {
            return true;
        }
    }

    public Customer createCustomer(CustomerDTO customer) {
        Customer newCustomer = new Customer(customer);

        if (customerExists(newCustomer.getId())) {
            throw new RuntimeException("Customer already exists");
        }

        if (!validCpf(newCustomer.getCpf())) {
            throw new RuntimeException("Invalid CPF");
        }

        if (!validName(newCustomer.getName())) {
            throw new RuntimeException("Invalid name");
        }

        return repository.save(newCustomer);
    }
}
