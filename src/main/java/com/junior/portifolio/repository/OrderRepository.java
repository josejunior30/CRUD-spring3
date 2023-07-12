package com.junior.portifolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.portifolio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
