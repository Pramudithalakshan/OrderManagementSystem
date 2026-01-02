package org.craftigen.service;

import org.craftigen.dtos.OrderDTO;
import org.craftigen.model.Order;
import org.craftigen.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class OrderService {

    private final OrderRepository repository;

    OrderService(OrderRepository repository){
        this.repository=repository;
    }
    public List<Order> getOrder(){
        return repository.findAll();
    }
    public void addOrder(@RequestBody OrderDTO order){
        Order persistentOrder = new Order();
        persistentOrder.setId(order.getId());
        persistentOrder.setDate(order.getDate());
        persistentOrder.setName(order.getName());
        persistentOrder.setPrice(order.getPrice());
        persistentOrder.setQty(order.getQty());
        repository.save(persistentOrder);
    }
}
