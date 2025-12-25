package org.craftigen.controller;

import org.craftigen.model.Order;
import org.craftigen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orders")

public class OrderController {
    @Autowired
    OrderRepository repository;
    @GetMapping("/get-order")
    public List<Order> getOrderDetails(){
        return repository.findAll();
    }
    @PostMapping("/add-order")
    public void addOrderDetails(@RequestBody Order order){
        repository.save(order);
    }

}
