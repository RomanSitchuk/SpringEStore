package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Category;

public interface CategoryDAO {
	void insertCategory(Category category);
	void deleteCategory(Category category);
	Category findByName(String name);
	List <Category> findByBrand(int id);

}
