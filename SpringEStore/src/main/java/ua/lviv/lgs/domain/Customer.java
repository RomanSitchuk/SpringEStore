package ua.lviv.lgs.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@NamedQueries({
	@NamedQuery(name = "Customer.getByEmail", query = "select c from Customer c where c.email=:email")
})
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column(length = 50)
	private String email;
	@Column(length = 50)
	private String phone;
	@Column(length = 255)
	private String address;
	@Column(length = 50)
	private String city;
	@Column(name="date_created")
	private Date dateCreated;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	private List <Order> orders;
	
	
	public Customer() {
		
	}
	
	
	public Customer(String name, String email, String phone, String address,
			String city, Date dateCreated) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.dateCreated = dateCreated;
		
	}

	

	public Customer(String email) {
			this.email = email;
	}


	public Customer(String name, String email, String phone, String address,
			String city) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
	}


	
	public Customer(String name, String email, String phone, String city) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	
	
	
	
}
