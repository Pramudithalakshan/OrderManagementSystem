package org.craftigen.service;

import org.craftigen.dtos.CustomerDTO;
import org.craftigen.entity.Customer;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
     List<Customer> getCustomer();
     void addCustomer(@RequestBody CustomerDTO customer);
}
