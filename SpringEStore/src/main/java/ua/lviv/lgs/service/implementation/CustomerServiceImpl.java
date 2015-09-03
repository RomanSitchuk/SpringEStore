package ua.lviv.lgs.service.implementation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.CustomerDao;
import ua.lviv.lgs.domain.Customer;
import ua.lviv.lgs.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired(required=true)
	private CustomerDao dao;
	
	public void insertCustomer(Customer customer) {
		dao.insertCustomer(customer);
		
	}

	public void deleteCustomer(String email) {
		dao.deleteCustomer(new Customer(email));
		
	}

	public List<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}

	public Customer findByEmail(String email) {
		return dao.findByEmail(email);
	}

	

}
