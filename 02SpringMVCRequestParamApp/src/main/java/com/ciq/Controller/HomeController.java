package com.ciq.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value="/msg")
	public String loadmessage() {
		return "message";
	}
	
	@RequestMapping(value="/msg/message", method=RequestMethod.GET)
	public String executeMsg(@RequestParam(name="name") String name) {
		System.out.println("welcome to parameter reading..." + name);
		//ModelAndView model=new ModelAndView();
		//model.addObject(name,"name");
		return "welcome";
	}
		
}
	
	
	


