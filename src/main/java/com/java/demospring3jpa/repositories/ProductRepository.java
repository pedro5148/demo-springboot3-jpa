package com.java.demospring3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demospring3jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
