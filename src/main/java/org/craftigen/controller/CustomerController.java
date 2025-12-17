package org.craftigen.controller;

import org.craftigen.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class CustomerController {
    ArrayList<Customer> customersArrayList = new ArrayList<>();
    @GetMapping("/get-customer-details")
    public ArrayList<Customer> getCustomerDetails(){
         return customersArrayList;
    }
    @PostMapping("/add-customer-details")
    public void addCustomerDetails(@RequestBody Customer Customer){
        customersArrayList.add(Customer);
    }
}
