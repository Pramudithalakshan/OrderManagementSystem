package org.craftigen.controller;

import org.craftigen.model.Customer;
import org.craftigen.model.dtos.CustomerDTO;
import org.craftigen.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerRepository repository;
    @Autowired
    CustomerController(CustomerRepository repository){
     this.repository=repository;
    }

    @GetMapping("/get-customer")
    public List<Customer> getCustomerDetails(){
        return repository.findAll();
    }
    @PostMapping("/add-customer")
     public void addCustomerDetails(@RequestBody CustomerDTO customer){
        Customer persistentCustomer = new Customer();
        persistentCustomer.setId(customer.getId());
        persistentCustomer.setCity(customer.getCity());
        persistentCustomer.setFirst_name(customer.getFirst_name());
        persistentCustomer.setLast_name(customer.getLast_name());
        persistentCustomer.setPhone_number(customer.getPhone_number());
        repository.save(persistentCustomer);
    }
}
