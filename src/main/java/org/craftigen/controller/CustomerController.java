package org.craftigen.controller;

import org.craftigen.model.Customer;
import org.craftigen.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    private CustomerRepository repository;
    @Autowired
    CustomerController(CustomerRepository repository){
     this.repository=repository;
    }

    @GetMapping("/get-customer")
    public List<Customer> getCustomerDetails(){
        return repository.findAll();
    }
    @PostMapping("/add-customer")
     public void addCustomerDetails(@RequestBody Customer customer){
        repository.save(customer);
    }
}
