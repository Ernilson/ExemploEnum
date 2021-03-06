package br.com.Enum.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Enum.entities.Order;
import br.com.Enum.repository.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderRepository repository;
	
	public ResponseEntity<List<Order>>findAll(){
		List<Order> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
}
