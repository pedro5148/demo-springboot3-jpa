package com.java.demospring3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demospring3jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
