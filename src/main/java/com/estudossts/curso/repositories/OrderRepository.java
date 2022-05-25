package com.estudossts.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudossts.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
