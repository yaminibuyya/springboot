package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.ProductDaoImpl;
import com.Model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDaoImpl productDaoImpl;
	@Override
	public void save(Product product) {
		productDaoImpl.save(product);
	}
	@Override
	public List<Product> getallproducts() {
		return  productDaoImpl.getallproducts();
	}
	@Override
	public Product getbyid(int id) {
		return productDaoImpl.getbyid(id);
	}
	@Override
	public void update(Product product) {
		productDaoImpl.update(product);		
	}
	@Override
	public void delete(int id) {
		productDaoImpl.delete(id);
	}
				
				
	}
	

