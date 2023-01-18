package com.gbtechnology.ordersystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbtechnology.ordersystem.entities.Order;
import com.gbtechnology.ordersystem.entities.User;
import com.gbtechnology.ordersystem.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository respository;
	
	public List<Order> findAll(){
		return respository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = respository.findById(id);
		return order.get();
	}

}
