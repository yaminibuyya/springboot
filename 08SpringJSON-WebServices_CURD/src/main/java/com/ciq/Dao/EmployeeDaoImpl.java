package com.ciq.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.Bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public void save(Employee employee) {
      
		int result=jdbctemplate.update("insert into Employee values(?,?,?)",
				new Object[]{employee.getId(),employee.getName(),employee.getSalary()});
		
		System.out.println(result);
	}

	@Override
	public List<Employee> getallEmployees() {
		BeanPropertyRowMapper<Employee> beanmapper=new BeanPropertyRowMapper<>(Employee.class);
       System.out.println("get All Employees"+beanmapper);
       
		return jdbctemplate.query("select*from employee",beanmapper);
	}

	@Override
	public Employee getbyId(int id) {

		return jdbctemplate.queryForObject("select * from employee where id=?", new BeanPropertyRowMapper<>(Employee.class),id);
	}

	@Override
	public void update(Employee employee) {
     String update="update employee set name=?,salary=? where id=?";
     jdbctemplate.update(update,new Object[] {employee.getName(),employee.getSalary(),employee.getId()});
		
	}

	@Override
	public void delete(int id) {

		jdbctemplate.update("delete from employee where id=?", id);
	}

}
