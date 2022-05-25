package com.estudossts.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudossts.curso.entities.Order;
import com.estudossts.curso.entities.Users;
import com.estudossts.curso.repositories.OrderRepository;
import com.estudossts.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Users user1 = new Users(null, "maria", "maria@gmail.com", "55555555", "12345");
		Users user2 = new Users(null, "karine", "karine@gmail.com", "55555555", "12345");
		
		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
		Order order2 = new Order(null, Instant.parse("2019-07-20T03:42:10Z"), user2);
		Order order3 = new Order(null, Instant.parse("2019-07-20T15:21:22Z"), user1);
		

		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		
	}
	
}
