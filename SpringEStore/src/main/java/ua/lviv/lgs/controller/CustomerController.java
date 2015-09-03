package ua.lviv.lgs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.domain.Customer;
import ua.lviv.lgs.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService service; 
	
	@RequestMapping(value = "/showAllCustomers")
	public String getAllCustomers(Model model){
		List<Customer> customers = service.getAllCustomers();
		model.addAttribute("customers", customers);
		return "customers";
		}
	@RequestMapping(value = "/createCustomer")
	public String createCustomerPage(){
		return "newCustomer";
	}
	
	@RequestMapping(value = "/showAllCustomers", method = RequestMethod.POST)
	public String creatingCustomer(Model model, @RequestParam(value = "name")
									String name, @RequestParam(value ="email")
									String email, @RequestParam(value = "phone")
									String phone,@RequestParam(value ="city")
									String city){
		Customer c = new  Customer(name, email, phone, city);
		service.insertCustomer(c);
		return "redirect:/showAllCustomers";
	}
	
	
	

}
