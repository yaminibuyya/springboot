package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Product;
import com.Service.ProductServiceImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-servlet.xml");
		ProductServiceImpl bean=context.getBean(ProductServiceImpl.class);
		Product p=new Product(1,"resh","JBL" ,7000.00);
		//bean.save(p);
		//System.out.println(bean.getallproducts());
		bean.update(p);
		//System.out.println("updated");
		
		
		
		//System.out.println(bean.getbyid(1));
		//bean.delete(9);
		//System.out.println("deleted");
		//System.out.println(bean.getallproducts());
	}
	
	

}
