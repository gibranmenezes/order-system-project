package com.gbtechnology.ordersystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbtechnology.ordersystem.entities.User;
import com.gbtechnology.ordersystem.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository respository;
	
	public List<User> findAll(){
		return respository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = respository.findById(id);
		return user.get();
	}

}
