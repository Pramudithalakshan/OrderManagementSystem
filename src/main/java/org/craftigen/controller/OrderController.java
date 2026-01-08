package org.craftigen.controller;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.OrderDTO;
import org.craftigen.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/get-order")
    public List<OrderDTO> getOrderDetails(){
       return orderService.getOrder();
    }
    @PostMapping("/add-order")
    public void addOrderDetails(@RequestBody OrderDTO order){
        orderService.addOrder(order);
    }
    @DeleteMapping("/remove-order/{id}")
    public void deleteOrder(@PathVariable String id){
        orderService.deleteOrder(id);
    }
}
