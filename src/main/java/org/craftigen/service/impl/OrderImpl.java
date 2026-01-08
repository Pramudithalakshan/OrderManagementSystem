package org.craftigen.service.impl;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.OrderDTO;
import org.craftigen.mapper.OrderMapper;
import org.craftigen.repository.OrderRepository;
import org.craftigen.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderImpl implements OrderService {
    private final OrderRepository repository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderDTO> getOrder() {
        return orderMapper.toDto(repository.findAll());
    }

    @Override
    public void addOrder(OrderDTO order) {
        repository.save(orderMapper.toEntity(order));
    }
}
