package com.SpringBootExample.Service;

import java.util.List;

import org.springframework.core.annotation.Order;

public interface OrderService {
	
	public static Order addOrder(Order Order) {
		return null;
	}

	double getCustomerOrderGrandTotal(long cartId);
	
	Order getOrderByorderid(Order order);
	
	List<Order> getAllOrder();
	public Order getCustomerOrderById(long customerOrderId);
	
	public void deleteCustomerOrderById(long OrderId);
    public List<Order> getOrder();



	Order getOrder(long id);

	
}


