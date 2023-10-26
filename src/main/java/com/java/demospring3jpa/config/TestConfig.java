package com.java.demospring3jpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.java.demospring3jpa.entities.User;
import com.java.demospring3jpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Pedro Eugenio", "pedro@gmail.com", "988324534", "123456");
		User u2 = new User(null, "Maria Paula", "maria@gmail.com", "97667679", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
