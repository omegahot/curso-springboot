package com.estudossts.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudossts.curso.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	
}
