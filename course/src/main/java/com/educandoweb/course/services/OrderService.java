package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	

	private final OrderRepository repository;
		
	public OrderService(OrderRepository repo) {
		this.repository = repo;
		}	
	
	public List<Order> findAll() {
		
		return repository.findAll();
	
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
