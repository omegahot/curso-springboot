package com.estudossts.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudossts.curso.entities.Users;
import com.estudossts.curso.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id) {
		Optional<Users> opt = repository.findById(id);
		return opt.get();
	}
}
