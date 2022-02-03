package br.com.Enum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Enum.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}