package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Model.Product;
@Repository
@Transactional 
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Product product) {
      hibernateTemplate.save(product);
	
	}

	@Override
	public List<Product> getallproducts() {
		return hibernateTemplate.loadAll(Product.class);
	}

	@Override
	public Product getbyid(int id) {

		return hibernateTemplate.get(Product.class,id);
	}

	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public void delete(int id) {
		Product load1 = hibernateTemplate.load(Product.class,id);
		hibernateTemplate.delete(load1);
	}
	
	

}
