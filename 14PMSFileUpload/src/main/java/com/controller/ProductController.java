package com.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Model.LogClass;
import com.Model.Product;
import com.Service.ProductServiceImpl;

@Controller
public class ProductController {
	

	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping("/get")
	public String getAll() {
		return "Hello";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginmethod() {
		return "login";
	}
	
	

	@GetMapping(value ="/lg")
	//@GetMapping("/updateEmp")
	public ModelAndView loginInfo(@RequestParam("psw") String psd,@RequestParam("usr") String username, LogClass logclass) {
	   //getById():bz first we load the data and then updating the data

		if(psd.equals("password")&&username.equals("yamini")) {
			ModelAndView modelAndView = new ModelAndView("redirect:/listproduct");
			return modelAndView;
		}
		else {
			System.out.println("incorrect password"); 
			ModelAndView modelAndView1 = new ModelAndView("LoginError"); 
			return modelAndView1;
		}

		
		
	
	}
	

	
	@GetMapping(value="/save1")
	public String Saveproduct() {
		return "save";
		
	}
	@PostMapping(value="/save1")
	public ModelAndView saveProduct(@ModelAttribute Product product,BindingResult result) {
	
		if(result.hasErrors()) {
			return new ModelAndView("save");
					
		}
		
		ModelAndView modelAndView=new ModelAndView();
		productServiceImpl.save(product);
		System.out.println(product);
		modelAndView.setViewName("redirect:/listproduct");
		return modelAndView;
		
	
	}
	
	
	
	
	
	
	 
	
	@GetMapping(value = "/getalllink")
	public String linkPage() {
		return "getall";
	}
	
	
	@RequestMapping(value="/listproduct",method=RequestMethod.GET)
	public ModelAndView getallProducts() {
		return new ModelAndView("getall","getlist",productServiceImpl.getallproducts());
		

}
//	@GetMapping("/products")
//	public String getAllProducts(Model model) {
//	    List<Product> products = productServiceImpl.getallproducts();
//	    model.addAttribute("getlist", products);
//	    return "getall";
//	}
	
	
	@GetMapping("/getbyid")
    public ModelAndView getbyid(@RequestParam int id, Product product) {
        
        product = productServiceImpl.getbyid(id);
        ModelAndView modelAndView=new ModelAndView("update");
        modelAndView.addObject(product);
        
        return modelAndView ;
        
    }
    
    @PostMapping(value = "/update")
    public String updateProduct(@ModelAttribute("products") Product product ) {
        productServiceImpl.update(product);
        return "redirect:/listproduct ";
        
    }
    
    
    @GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		productServiceImpl.delete(id);
		
		return "redirect:/listproduct";
		
	}
}
	