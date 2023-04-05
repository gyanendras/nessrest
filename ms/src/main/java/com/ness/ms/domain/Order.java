package com.ness.ms.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	Long orderId;
	
    Long userId;
	LocalDate orderDate;
	Double totalPrice;
	String status;
	
	public Order() {
		
	}
	
	
	public Order(Long orderId, Long userId, LocalDate ordeDate, Double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.orderDate = ordeDate;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public LocalDate getOrdeDate() {
		return orderDate;
	}
	public void setOrdeDate(LocalDate ordeDate) {
		this.orderDate = ordeDate;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
