package org.craftigen.service;

import org.craftigen.dtos.CustomerDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
     List<CustomerDTO> getCustomer();
     void addCustomer(@RequestBody CustomerDTO customer);
}
