package org.craftigen.controller;

import org.craftigen.dtos.CustomerDTO;
import org.craftigen.entity.Customer;
import org.craftigen.service.CustomerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerImpl customerService;
    @Autowired
    CustomerController(CustomerImpl customerService){
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
