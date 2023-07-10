package com.junior.portifolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.portifolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
