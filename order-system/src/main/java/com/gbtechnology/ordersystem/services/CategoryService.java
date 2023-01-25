package com.gbtechnology.ordersystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbtechnology.ordersystem.entities.Category;
import com.gbtechnology.ordersystem.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository respository;
	
	public List<Category> findAll(){
		return respository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> category = respository.findById(id);
		return category.get();
	}

}
