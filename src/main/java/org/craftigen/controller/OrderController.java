package org.craftigen.controller;

import org.craftigen.model.Order;
import org.craftigen.dtos.OrderDTO;
import org.craftigen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderRepository repository;
    @Autowired
    OrderController(OrderRepository repository){
        this.repository=repository;
    }
    @GetMapping("/get-order")
    public List<Order> getOrderDetails(){
        return repository.findAll();
    }
    @PostMapping("/add-order")
    public void addOrderDetails(@RequestBody OrderDTO order){
        Order persistentOrder = new Order();
        persistentOrder.setId(order.getId());
        persistentOrder.setDate(order.getDate());
        persistentOrder.setName(order.getName());
        persistentOrder.setPrice(order.getPrice());
        persistentOrder.setQty(order.getQty());
        repository.save(persistentOrder);
    }

}
