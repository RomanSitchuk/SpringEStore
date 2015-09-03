package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.domain.Customer;

public interface CustomerDao {
	void insertCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	List <Customer> getAllCustomers();
	Customer findByEmail(String email);
	

}
