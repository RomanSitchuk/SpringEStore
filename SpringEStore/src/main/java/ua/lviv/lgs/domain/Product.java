package ua.lviv.lgs.domain;

import java.util.Date;
import java.util.List;






import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name = "Product.getByName", query = "select p from Product p where p.name = :name"),
	@NamedQuery(name = "Product.getByPrice", query = "select p from Product p where p.price = :price"),
	@NamedQuery (name = "Product.getByLastUpdate", query = "select p from Product p where p.lastUpdate = :lastUpdate")
})
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 50)
	private String name;
	@Column
	private Double price;
	@Column(length = 100)
	private String imagePath;
	@Column(name = "last_update")
	private Date lastUpdate;
	@ManyToMany
	@JoinTable(name="ordered_product",
				joinColumns = @JoinColumn(name="product_id"),
				inverseJoinColumns = @JoinColumn(name="order_id"))
	List<Order> orders;
	@ManyToOne
	private Brand brand;

	public Product() {
	}

	public Product(String name, double price, Date lastUpdate) {
		this.name = name;
		this.price = price;
		this.lastUpdate = lastUpdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	

	public List<Order> getOrders() {
		return orders;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
