package org.craftigen.controller;

import org.craftigen.model.Customer;
import org.craftigen.dtos.CustomerDTO;
import org.craftigen.repository.CustomerRepository;
import org.craftigen.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    CustomerController(CustomerService customerService){
     this.customerService=customerService;
    }

    @GetMapping("/get-customer")
    public List<Customer> getCustomerDetails(){
        return customerService.getCustomer();
    }
    @PostMapping("/add-customer")
     public void addCustomerDetails(@RequestBody CustomerDTO customer){
       customerService.addCustomer(customer);
    }
}
