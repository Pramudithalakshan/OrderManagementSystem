package org.craftigen.controller;

import org.craftigen.entity.Order;
import org.craftigen.dtos.OrderDTO;
import org.craftigen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    @Autowired
    OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping("/get-order")
    public List<Order> getOrderDetails(){
       return orderService.getOrder();
    }
    @PostMapping("/add-order")
    public void addOrderDetails(@RequestBody OrderDTO order){
        orderService.addOrder(order);
    }

}
