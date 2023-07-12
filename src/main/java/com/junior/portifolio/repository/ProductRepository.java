package com.junior.portifolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.portifolio.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
