package com.ness.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ness.ms.domain.Order;

@Service
public class OrderService {
	
	@Autowired 
	@Qualifier("deforderbean")
	Order order;
	
	@Autowired
	Order getDefOrder2;
	
	Order sorder;
	
	// @Autowired
	public void setOrder(@Qualifier("deforderbean") Order order) {
		this.sorder = order;
	}
	
	public Order getDefaultOrder() {
		return sorder;
	}
	
	@Autowired
	OrderService(@Qualifier("constbean") Order order) {
		this.sorder = order;
	}

}
