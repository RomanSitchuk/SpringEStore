package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.CustomerDao;
import ua.lviv.lgs.dao.ProductDAO;
import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO dao;
	
	public void insertProduct(Product product) {
		dao.insertProduct(product);
	}

	public void deleteProduct(Product product) {
		dao.deleteProduct(product);

	}

	public List<Product> findAll() {
		return dao.findAll();
	}

	public Product findByName(String name) {
		return dao.findByName(name);
	}

	public List<Product> findByPrice(Double price) {
		return dao.findByPrice(price);
	}

	public List<Product> findByBrand(Brand brand) {
		return dao.findByBrand(brand);
	}

}
