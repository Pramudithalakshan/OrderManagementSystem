package org.craftigen.controller;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.CustomerDTO;
import org.craftigen.service.impl.CustomerImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerImpl customerService;

    @GetMapping("/get-customer")
    public List<CustomerDTO> getCustomerDetails(){
        return customerService.getCustomer();
    }
    @PostMapping("/add-customer")
     public void addCustomerDetails(@RequestBody CustomerDTO customer){
       customerService.addCustomer(customer);
    }

    @DeleteMapping("/remove-customer/{id}")
    public void deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
    }

}
