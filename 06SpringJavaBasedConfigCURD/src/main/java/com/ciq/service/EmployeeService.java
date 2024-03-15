package com.ciq.service;

import java.util.List;

import com.ciq.Bean.Employee;

public interface EmployeeService {
	
	void save(Employee employee);
	
	List<Employee> getallemployees();
	
	Employee getbyId(int id);
	
	void update(Employee employee);
	
	void delete(int id);

}
