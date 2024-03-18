package com.Dao;

import java.util.List;

import com.Model.Product;

public interface ProductDao {
	void save (Product product);
	
	List<Product> getallproducts();
	
	Product getbyid(int id);
	
	void update(Product product);
	
	void delete (int id);
	
}
