package com.ness.ms;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ness.ms.domain.Order;
import com.ness.ms.repo.OrderRepository;
import com.ness.ms.service.OrderService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
	
	@Mock
	OrderRepository orderRepository;

    @InjectMocks
	OrderService mockOrderService;
	
	@Autowired
	OrderService orderservice;
	
	@Test 
	void testGetDefOrder(){
		
		Order order = orderservice.getDefaultOrder();
		assertNotNull(order);
		
	}
	
	@Test 
	void testGetOrder(){
		
		//Mockito.when(orderRepository.getOrder(1L)).thenReturn(new Order(1l,1l,LocalDate.now(), 22.22, "InProcess"));
		//Order order = mockOrderService.getOrder(1L);
		//assertNotNull(order);
		
	}
	
	@Test
	void testCreateOrder() {
		Order order = new Order(1l,1l,LocalDate.now(), 11.11, "New");
		orderservice.createOrder(order);
	}
	
}
