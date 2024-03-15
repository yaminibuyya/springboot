package com.ciq.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.Model.Employee;

@Controller
public class HomeController {
	@org.springframework.web.bind.annotation.InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "mobileNumber" });
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(formatter, false));
	}

	
	//register=form action register
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String  ShowRegform() {
		return "reg-emp";
		
	}
	
//	@RequestMapping(value="register" , method=RequestMethod.POST )
//	public ModelAndView registerEmployee(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("salary") String salary) {
//    System.out.println(id+name+salary);
//    ModelAndView model=new ModelAndView("reg-success");
//    return model;
//}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView registerEmployee(@ModelAttribute("employee1" ) Employee employee, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("reg-emp");//if binding is not done properly it will return to reg-emp page
		}

		
		System.out.println(employee); 
		ModelAndView model=new ModelAndView("reg-success");
		return model;
	
	}
	public ModelAndView registerEmployee(
			@RequestParam int id,
			@RequestParam String name,
			@RequestParam double salary,
			@RequestParam long mobileNumber,
			@RequestParam String dob
			
			) throws ParseException, java.text.ParseException {
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setMobileNumber(mobileNumber);
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy/mm/dd");
		Date parse = formatter.parse(dob);
		employee.setDob(parse);
		System.out.println(employee);
		ModelAndView modelAndView = new ModelAndView("reg-success");
		modelAndView.addObject("employee1", employee);
		return modelAndView;

	}
	
	
	

}