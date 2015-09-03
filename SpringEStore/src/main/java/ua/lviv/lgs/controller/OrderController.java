package ua.lviv.lgs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.lviv.lgs.domain.Order;
import ua.lviv.lgs.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService oService;
	
	
//	@RequestMapping(value = "/ordernow/{id}", method = RequestMethod.GET)
//	public String orderNow(@PathVariable(value="id") int id, 
//			ModelMap modelMap, HttpSession session){
//		if(session.getAttribute("cart")==null){
//			List<Order> cart = new ArrayList<Order>();
//			Order order = new Order( )
//		}
//		return "";
//	}

}
