package com.ciq.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.PersonDaoimpl;
import com.ciq.Entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDaoimpl daoimpl;
	@Override
	public void save(Person person) {
          daoimpl.save(person);		
	}

}
