package org.craftigen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.craftigen.model.Order;
public interface OrderRepository extends JpaRepository<Order, String> {
}
