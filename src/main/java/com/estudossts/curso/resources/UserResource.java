package com.estudossts.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudossts.curso.entities.Users;
import com.estudossts.curso.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserServices service;
	
	@GetMapping
	public ResponseEntity<List<Users>> findAll(){
		
		List<Users> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id) {
		Users obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
