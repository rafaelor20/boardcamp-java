package com.boardcamp.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boardcamp.javaapi.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
