package com.ftatech.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ftatech.api.model.Customer;
import com.ftatech.api.repository.Repository;


@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private Repository repository;

    @GetMapping("/")
    public Iterable<Customer> GetCustomers() {
        return repository.findAll();
    }
    
    @PostMapping("/")
    public Customer CreateCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @PutMapping("/")
    public Customer EditCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    } 

    @DeleteMapping("/{id}")
    public void DeleteCustomer(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
