package com.ftatech.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftatech.api.model.Customer;

public interface Repository extends JpaRepository<Customer, Long> {
}
