package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.BrandDAO;
import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Category;
import ua.lviv.lgs.domain.Product;


@Repository
public class BrandDAOImpl implements BrandDAO{
	@PersistenceContext(unitName="Primary")
	private EntityManager em;
		
	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void insertBrand(Brand brand) {
		em.persist(brand);
		
	}

	@Transactional
	public void deleteBrand(Brand brand) {
		em.remove(brand);
		
	}
	@Transactional
	public Brand findByName(String name) {
		return (Brand) em.createNamedQuery("Brand.getByName").setParameter("name", name);
	}
	@Transactional
	public Brand findByProduct(int id) {
		Product pr = em.find(Product.class, id);
		return pr.getBrand();
	}
	@Transactional
	public List<Brand> findByCategory(int category_id) {
		Category c = em.find(Category.class, category_id);
		return c.getBrands();
	}


	
}
