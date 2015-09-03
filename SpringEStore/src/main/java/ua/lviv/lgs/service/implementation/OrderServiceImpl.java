package ua.lviv.lgs.service.implementation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.OrderDAO;
import ua.lviv.lgs.domain.Order;
import ua.lviv.lgs.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDAO oDao;
	
	public void insertOrder(Order order) {
		oDao.insertOrder(order);
	}

	public void deleteOrder(Order order) {
		oDao.deleteOrder(order);

	}

	public List<Order> getAllOrders() {
		
		return oDao.findAll();
	}

	public List<Order> findByOrderDate(Date orderDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Order> findByCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order findByProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
