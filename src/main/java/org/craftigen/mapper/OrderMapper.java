package org.craftigen.mapper;

import org.craftigen.dtos.OrderDTO;
import org.craftigen.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toDto(Order order);
    Order toEntity(OrderDTO order);
    List<OrderDTO> toDto(List<Order> orders);
}
