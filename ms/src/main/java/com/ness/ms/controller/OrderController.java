package com.ness.ms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ness.ms.domain.Order;
import com.ness.ms.service.OrderService;

@RestController
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired 
	OrderService orderService ;
	
	@GetMapping("/deforder")
	Order getDefaultOrder(){
		logger.debug("Default order to be created");
		return orderService.getDefaultOrder();
	}
	
	@GetMapping("/order/{id}")
	Order getOrder(@PathVariable Long id){
		logger.debug("Default order to be created");
		return orderService.getOrder(id);
	}
	
	@PostMapping("/order")
	Order createUpdOrder(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
	
	

}
