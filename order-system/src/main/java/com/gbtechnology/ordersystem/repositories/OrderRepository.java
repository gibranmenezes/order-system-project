package com.gbtechnology.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbtechnology.ordersystem.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

}
