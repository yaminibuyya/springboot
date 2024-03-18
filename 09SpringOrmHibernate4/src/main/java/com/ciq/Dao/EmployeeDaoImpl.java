package com.ciq.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	{
		System.out.println("1");
	}

	@Override
	public void save(Employee employee) {
		System.out.println("3");

		hibernateTemplate.save(employee);
		System.out.println("4");
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	


	
}
