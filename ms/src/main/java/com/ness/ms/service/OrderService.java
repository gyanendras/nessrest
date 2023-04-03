package com.ness.ms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ness.ms.domain.Order;
import com.ness.ms.repo.OrderRepository;

@Service
public class OrderService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	@Value("${application.service.level}")
	String serviceLevel;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired 
	@Qualifier("deforderbean")
	Order order;
	
	@Autowired
	Order getDefOrder2;
	
	Order sorder;
	
	@Autowired
	OrderService(@Qualifier("constbean") Order order) {
		this.sorder = order;
	}
	
	@Autowired
	public void setOrder(@Qualifier("deforderbean") Order order) {
		this.sorder.setStatus("FromSetter");
	
	}
	
	public Order getDefaultOrder() {
		System.out.println("Using service level " + serviceLevel);
		logger.debug("Logging Using service level  %s",serviceLevel);
		return sorder;
	}
	
	
	public Order getOrder(Long oderId) {
		return orderRepository.getOrder(oderId);
	}

}
