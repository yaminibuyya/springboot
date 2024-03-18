package com.ciq.Service;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeService  {
	
	
	void save (Employee employee);
	
	List<Employee> getEmployees();
	void update(Employee employee);
	void delete(Employee employee);


}
