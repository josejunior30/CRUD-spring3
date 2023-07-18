package com.junior.portifolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.portifolio.entities.OrderItem;
import com.junior.portifolio.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
