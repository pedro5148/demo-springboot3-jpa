package com.java.demospring3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demospring3jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
