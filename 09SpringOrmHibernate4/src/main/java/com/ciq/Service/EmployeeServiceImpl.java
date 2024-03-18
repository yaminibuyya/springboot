package com.ciq.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.EmployeeDaoImpl;
import com.ciq.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;
	
	
	{
		System.out.println("2");
	}

	public void save(Employee employee) {
		employeeDaoImpl.save(employee);
		System.out.println(employee+"==========");
		System.out.println("5");
		
	}

	public List<Employee> getEmployees() {
		return employeeDaoImpl.getEmployees();
		
	}

	public void update(Employee employee) {
		employeeDaoImpl.update(employee);
	}

	

	public void delete(Employee employee) {
		employeeDaoImpl.delete(employee);
	}
	
	
	
	
	
	
	
	
	
	

}
