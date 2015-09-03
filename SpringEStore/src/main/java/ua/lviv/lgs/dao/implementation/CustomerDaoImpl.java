package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.CustomerDao;
import ua.lviv.lgs.domain.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{
    @PersistenceContext(unitName ="Primary")
   	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
    
	@Transactional
	public void insertCustomer(Customer customer) {
		em.persist(customer);		
	}

	@Transactional
	public void deleteCustomer(Customer customer) {
		em.remove(customer);		
	}

	@Transactional
	public List<Customer> getAllCustomers() {
		return em.createQuery("from Customer").getResultList();
	}

	@Transactional
	public Customer findByEmail(String email) {
			return  (Customer) em.createNamedQuery("Customer.getByEmail").setParameter("email", email).getSingleResult();
	}

}
