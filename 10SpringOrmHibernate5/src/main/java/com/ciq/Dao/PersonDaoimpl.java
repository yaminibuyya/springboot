package com.ciq.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.Entity.Person;

@Repository
public class PersonDaoimpl implements PersonDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Person person) {
		hibernateTemplate.save(person);
	}

}
