package com.ftatech.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ftatech.api.model.Customer;
import com.ftatech.api.repository.Repository;

@RestController
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/")
    public String Hello() {
        return "Hello!";
    }
    
    @PostMapping("/")
    public Customer CreateCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

}
