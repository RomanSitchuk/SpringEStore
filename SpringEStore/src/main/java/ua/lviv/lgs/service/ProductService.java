package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Product;

public interface ProductService {
	void insertProduct(Product product);
	void deleteProduct(Product product);
	List <Product> findAll();
	Product findByName(String name);
	List <Product> findByPrice(Double price);
	List <Product> findByBrand(Brand brand);
}
