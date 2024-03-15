package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Bean.Employee;
import com.ciq.Dao.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDaoImpl empDaoimpl;
	
	@Override
	public void save(Employee employee) {
         empDaoimpl.save(employee);
		
	}

	@Override
	public List<Employee> getallemployees() {
		return empDaoimpl.getallEmployees();
	}

	@Override
	public Employee getbyId(int id) {
		return empDaoimpl.getbyId(id);
	}

	@Override
	public void update(Employee employee) {
		empDaoimpl.update(employee);
		
		
	}

	@Override
	public void delete(int id) {

		empDaoimpl.delete(id);
	}

}
