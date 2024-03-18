package com.ciq.Dao;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeDao {
	
	
	void save (Employee employee);
	
	List<Employee> getEmployees();
	
	void update(Employee employee);
	
	void delete(Employee employee);
	
	

}
