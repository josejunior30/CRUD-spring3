package com.junior.portifolio.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.junior.portifolio.entities.Category;
import com.junior.portifolio.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}
}
