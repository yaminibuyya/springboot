package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Entity.Person;
import com.ciq.Service.PersonServiceImpl;

public class PersonTest {
	
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		PersonServiceImpl bean= context.getBean(PersonServiceImpl.class);
		 Person p=new Person(2,"vamsi","Brickred",998767563);
		 
		 bean.save(p);
		 
		 
		 
				 
	}

}
