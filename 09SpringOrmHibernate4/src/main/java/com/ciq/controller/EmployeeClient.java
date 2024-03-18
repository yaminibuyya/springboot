package com.ciq.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Service.EmployeeServiceImpl;
import com.ciq.pojo.Employee;

public class EmployeeClient {
	
	
	public static void main(String[] args) {
		
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	EmployeeServiceImpl bean =  context.getBean(EmployeeServiceImpl.class);
	System.out.println(bean);
	
	Employee employee = new Employee(3,"bhavana",45000);
	
	bean.save(employee);
	
//System.out.println(bean.getEmployees());	

   // bean.update(employee);
	//bean.delete(employee);
	
	
	}
}
