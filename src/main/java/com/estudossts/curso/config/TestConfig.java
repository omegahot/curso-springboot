package com.estudossts.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudossts.curso.entities.Users;
import com.estudossts.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		Users user1 = new Users(null, "maria", "maria@gmail.com", "55555555", "12345");
		Users user2 = new Users(null, "karine", "karine@gmail.com", "55555555", "12345");
		

		userRepository.saveAll(Arrays.asList(user1, user2));
		
	}
	
}
