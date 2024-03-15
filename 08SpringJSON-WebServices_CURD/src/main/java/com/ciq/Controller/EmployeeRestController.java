package com.ciq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.Bean.Employee;
import com.ciq.service.EmployeeServiceImpl;

@RestController()
@RequestMapping(value="/rest")
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImpl empserviceimpl;
	
	
	//@ResponseBody
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public List<Employee> getRestEmps(){
		return empserviceimpl.getallemployees();
	}
	
	//@ResponseBody
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "hello welcome to app";
	}
	
	//@ResponseBody
	@RequestMapping(value="/emps/{id}", method=RequestMethod.GET)
	public Employee getbyIdEmps(@PathVariable int id){
		return   empserviceimpl.getbyId(id);
			
	}
	
	@PostMapping("/save")
	public void saveEmployee(@RequestBody Employee e) {
		empserviceimpl.save(e);
		}
	
	@PostMapping("/update")
	public void updateEmployee(@RequestBody Employee e) {
		empserviceimpl.update(e);
	}
	
	@PostMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable  int id) {
		empserviceimpl.delete(id);
		
	
	
	
	}
	}
