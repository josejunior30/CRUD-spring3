package com.junior.portifolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.portifolio.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
