package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Category;
import ua.lviv.lgs.domain.Product;

public interface BrandDAO {
	void insertBrand(Brand brand);
	void deleteBrand(Brand brand);
	Brand findByName(String name);
	Brand findByProduct(int id);
	List <Brand> findByCategory(int id);
}
