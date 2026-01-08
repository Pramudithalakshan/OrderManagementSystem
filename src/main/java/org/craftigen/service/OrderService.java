package org.craftigen.service;

import org.craftigen.dtos.OrderDTO;
import org.craftigen.entity.Order;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderService {
    public List<Order> getOrder();
    public void addOrder(@RequestBody OrderDTO order);
}
