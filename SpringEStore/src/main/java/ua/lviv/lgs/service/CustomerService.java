package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Customer;

public interface CustomerService {
	void insertCustomer(Customer customer);
	void deleteCustomer(String email);
	List <Customer> getAllCustomers();
	Customer findByEmail(String email);

}
