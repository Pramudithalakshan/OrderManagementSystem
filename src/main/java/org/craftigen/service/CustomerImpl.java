package org.craftigen.service;

import org.craftigen.dtos.CustomerDTO;
import org.craftigen.entity.Customer;
import org.craftigen.mapper.CustomerMapper;
import org.craftigen.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImpl implements CustomerService{

    private final CustomerRepository repository;
    private final CustomerMapper customerMapper;
    CustomerImpl(CustomerRepository repository,CustomerMapper customerMapper){
        this.repository=repository;
        this.customerMapper=customerMapper;
    }

    @Override
    public List<Customer> getCustomer() {
        return repository.findAll();
    }

    @Override
    public void addCustomer(CustomerDTO customer) {
        repository.save(customerMapper.toEntity(customer));
    }
}
