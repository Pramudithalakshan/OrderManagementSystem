package org.craftigen.service.impl;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.CustomerDTO;
import org.craftigen.mapper.CustomerMapper;
import org.craftigen.repository.CustomerRepository;
import org.craftigen.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerImpl implements CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper customerMapper;

    @Override
    public List<CustomerDTO> getCustomer() {
        return customerMapper.toDto(repository.findAll());
    }

    @Override
    public void addCustomer(CustomerDTO customer) {
        repository.save(customerMapper.toEntity(customer));
    }

    @Override
    public void deleteCustomer(String id) {
        repository.deleteById(id);
    }

}
