package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_table")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String model;
	@Column
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String model, double price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public Product(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public Product(int id) {
		super();
		this.id = id;
	
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	

}
