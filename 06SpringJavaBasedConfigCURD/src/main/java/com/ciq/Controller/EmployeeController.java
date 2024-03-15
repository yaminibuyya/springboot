package com.ciq.Controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.Bean.Employee;
import com.ciq.service.EmployeeServiceImpl;

@Controller

public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empserviceimpl; 
	
	@RequestMapping(value="/home")
	public String loadEmp() {
		return "emp-save";
	}
	
	@PostMapping(value="/save")
	public ModelAndView saveEmp(@ModelAttribute Employee employee,BindingResult result) {
	
		if(result.hasErrors()) {
			return new ModelAndView("emp-save");
					
		}
		
		ModelAndView modelAndView=new ModelAndView();
		empserviceimpl.save(employee);
		System.out.println(employee);
		modelAndView.setViewName("redirect:/listemps");
		return modelAndView;
		
}
	@RequestMapping(value="/listemps",method=RequestMethod.GET)
	public ModelAndView getallEmployees() {
		return new ModelAndView("emp-list","emps",empserviceimpl.getallemployees());
		
	}
	
	@GetMapping("/updateEmp")
	public ModelAndView update(@RequestParam int id,Employee employee) {
		employee=empserviceimpl.getbyId(id);
		ModelAndView modelAndView=new ModelAndView("emp-update");
		modelAndView.addObject(employee);
	
		return modelAndView;
		    
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute("employee") Employee employee) {
		empserviceimpl.update(employee);
		
		return "redirect:/listemps";
		
	}
	
	@GetMapping("/deleteEmp")
	public String delete(@RequestParam("id") int id) {
		empserviceimpl.delete(id);
		
		return "redirect:/listemps";
		
	}
	
}
