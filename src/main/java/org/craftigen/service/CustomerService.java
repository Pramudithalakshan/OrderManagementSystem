package org.craftigen.service;

import org.craftigen.dtos.CustomerDTO;
import org.craftigen.model.Customer;
import org.craftigen.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;
    CustomerService(CustomerRepository repository){
        this.repository=repository;
    }
    public List<Customer> getCustomer(){
        return repository.findAll();
    }
    public void addCustomer(@RequestBody CustomerDTO customer){
        Customer persistentCustomer = new Customer();
        persistentCustomer.setId(customer.getId());
        persistentCustomer.setCity(customer.getCity());
        persistentCustomer.setFirst_name(customer.getFirst_name());
        persistentCustomer.setLast_name(customer.getLast_name());
        persistentCustomer.setPhone_number(customer.getPhone_number());
        repository.save(persistentCustomer);
    }
}
