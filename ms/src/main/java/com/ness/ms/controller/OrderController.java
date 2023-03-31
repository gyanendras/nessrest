package com.ness.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ness.ms.domain.Order;
import com.ness.ms.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired 
	OrderService orderService ;
	
	@GetMapping("/deforder")
	Order getDefaultOrder(){
		
		return orderService.getDefaultOrder();
	}
	
	

}
