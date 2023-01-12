package com.gbtechnology.ordersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbtechnology.ordersystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
