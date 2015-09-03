package ua.lviv.lgs.service;

import java.util.Date;
import java.util.List;

import ua.lviv.lgs.domain.Order;

public interface OrderService {
	void insertOrder(Order order);
	void deleteOrder(Order order);
	List <Order> getAllOrders();
	List <Order> findByOrderDate(Date orderDate);
	List <Order>  findByCustomer(int id);
	Order findByProduct(int id);
}
