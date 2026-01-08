package org.craftigen.service;

import org.craftigen.dtos.OrderDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderService {
     List<OrderDTO> getOrder();
     void addOrder(@RequestBody OrderDTO order);
     void deleteOrder(String id);
}
