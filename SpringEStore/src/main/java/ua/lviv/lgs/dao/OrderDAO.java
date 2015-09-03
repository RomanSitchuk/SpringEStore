package ua.lviv.lgs.dao;


import java.util.Date;
import java.util.List;



import ua.lviv.lgs.domain.Customer;
import ua.lviv.lgs.domain.Order;


public interface OrderDAO {
	void insertOrder(Order order);
	void deleteOrder(Order order);
	List <Order> findByOrderDate(Date orderDate);
	List <Order>  findByCustomer(int id);
	Order findByOrder(int id);
	List<Order> findAll();
	
	
}
