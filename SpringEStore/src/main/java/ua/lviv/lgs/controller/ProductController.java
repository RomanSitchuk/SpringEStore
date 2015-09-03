package ua.lviv.lgs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;

	@RequestMapping("/allProducts")
	public String allProdcts(Model model) {
		List<Product> products = service.findAll();
		model.addAttribute("listProducts", products);
		return "products";
	}
}
