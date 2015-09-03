package ua.lviv.lgs.dao.implementation;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ua.lviv.lgs.dao.ProductDAO;
import ua.lviv.lgs.domain.Brand;
import ua.lviv.lgs.domain.Order;
import ua.lviv.lgs.domain.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	@PersistenceContext(unitName="Primary")
	private EntityManager em;
		
	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void insertProduct(Product product) {
		em.persist(product);		
	}
	
	@Transactional
	public void deleteProduct(Product product) {
		em.remove(product);
		
	}
	
	@Transactional
	public Product findByName(String name) {
		return (Product) em.createNamedQuery("Product.getByName").setParameter("name", name).getSingleResult();
	}
	
	@Transactional
	public List<Product> findByPrice(Double price) {
		return em.createNamedQuery("Product.getByPrice").getResultList();
	}

	@Transactional
	public List<Product> findByBrand(Brand brand) {
		return null;
	}

	@Transactional
	public List<Product> findByOrder(int id){
		Order o = em.find(Order.class, id);
		return o.getProducts();
	}
	@Transactional
	public List<Product> findByLastUpdate(Date lastUpdate) {
		return em.createNamedQuery("Product.getByLastUpdate").setParameter("lastUpdate", lastUpdate).getResultList();
	}
	@Transactional
	public List<Product> findAll() {
				return em.createQuery("From Product").getResultList();
	}

}
