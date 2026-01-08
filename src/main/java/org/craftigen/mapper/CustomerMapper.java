package org.craftigen.mapper;

import org.craftigen.dtos.CustomerDTO;
import org.craftigen.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDTO customer);
    CustomerDTO toDto(Customer customer);
}
