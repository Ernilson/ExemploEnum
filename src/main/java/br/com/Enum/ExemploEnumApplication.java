package br.com.Enum;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.Enum.Enumerados.OrderStatus;
import br.com.Enum.entities.Order;
import br.com.Enum.repository.OrderRepository;

@SpringBootApplication
public class ExemploEnumApplication implements CommandLineRunner{

	@Autowired
	private OrderRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ExemploEnumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order o1 = new Order(null, Instant.parse("2021-01-20T21:05:00Z"), OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2022-02-03T21:04:00Z"), OrderStatus.DELIVERED);		
		Order o3 = new Order(null, Instant.parse("2022-03-10T21:07:03Z"), OrderStatus.SHIPPED);
		
		repository.saveAllAndFlush(Arrays.asList(o1,o2,o3));
		
	}

}
