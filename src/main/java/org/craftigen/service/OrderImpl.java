package org.craftigen.service;

import org.craftigen.dtos.OrderDTO;
import org.craftigen.entity.Order;
import org.craftigen.mapper.OrderMapper;
import org.craftigen.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderImpl implements OrderService{
    private final OrderRepository repository;
    private final OrderMapper orderMapper;
    OrderImpl(OrderRepository repository,OrderMapper orderMapper){
        this.repository=repository;
        this.orderMapper=orderMapper;
    }

    @Override
    public List<Order> getOrder() {
        return repository.findAll();
    }

    @Override
    public void addOrder(OrderDTO order) {
        repository.save(orderMapper.toEntity(order));
    }
}
