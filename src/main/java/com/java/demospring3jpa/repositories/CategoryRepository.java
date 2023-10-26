package com.java.demospring3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demospring3jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
