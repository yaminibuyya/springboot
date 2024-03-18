package com.Service;

import java.util.List;

import com.Model.Product;

public interface ProductService {
	void save(Product product);
	
	List<Product> getallproducts();
	
    Product getbyid(int id);
	
	void update(Product product);
	
	void delete (int id);
	
	

	
	

}
