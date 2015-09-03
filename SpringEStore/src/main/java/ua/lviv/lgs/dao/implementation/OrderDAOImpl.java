package ua.lviv.lgs.dao.implementation;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




import ua.lviv.lgs.dao.OrderDAO;
import ua.lviv.lgs.domain.Order;
import ua.lviv.lgs.domain.Customer;
import ua.lviv.lgs.domain.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {
	
	@PersistenceContext(unitName = "Primary")
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	@Transactional
	public void insertOrder(Order order) {
		em.persist(order);
		
	}

	public void deleteOrder(Order order) {
		em.remove(order);
		
	}


	public List<Order> findByOrderDate(Date orderDate) {
		
		return null;
	}

	public List<Order> findByCustomer(int id) {
		
		return null;
	}

	public Order findByOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Order> findAll() {
		
		return em.createQuery("from Order").getResultList();
	}

	

	

}
