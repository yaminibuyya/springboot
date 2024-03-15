package com.ciq.Dao;

import java.util.List;

import com.ciq.Bean.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	
	List<Employee> getallEmployees();
	
	Employee getbyId(int id);
	
	void update(Employee employee);
	
	void delete(int id);
	
	
	

}
