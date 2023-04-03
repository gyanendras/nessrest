package com.ness.ms;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ness.ms.domain.Order;
import com.ness.ms.service.OrderService;

@SpringBootTest
public class OrderServiceTest {

	
	@Autowired
	OrderService orderservice;
	
	@Test 
	void testGetDefOrder(){
		
		Order order = orderservice.getDefaultOrder();
		assertNotNull(order);
		
	}
	
	@Test 
	void testGetOrder(){
		
		Order order = orderservice.getOrder(1L);
		assertNotNull(order);
		
	}
	
}
