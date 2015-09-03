package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.CategoryDAO;
import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Category;





@Repository
public class CategoryDAOImpl implements CategoryDAO{
@PersistenceContext(unitName = "Primary")
private EntityManager em;

public EntityManager getEm() {
	return em;
}

public void setEm(EntityManager em) {
	this.em = em;
}
	
    @Transactional
	public void insertCategory(Category category) {
		em.persist(category);
		
	}

    @Transactional
	public void deleteCategory(Category category) {
		em.remove(category);
		
	}

    @Transactional
	public Category findByName(String name) {
		return (Category) em.createNamedQuery("Category.getByName").setParameter("name", name).getSingleResult();
	}

    @Transactional
	public List<Category> findByBrand(int id) {
    	Brand br =  em.find(Brand.class, id);
		return br.getCategories();
	}


}
