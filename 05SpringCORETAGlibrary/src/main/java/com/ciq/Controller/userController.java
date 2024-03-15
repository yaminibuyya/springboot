package com.ciq.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ciq.BEAN.User;

@Controller
public class userController {

	@GetMapping("/add")
	public String loadUser(@ModelAttribute User user,Model model) {
	Map<String,String>	roles=new HashMap<String,String>();
	roles.put("CEO", "CEO");
	roles.put("Manager", "Manger");
	roles.put("TL", "tech lead");
	roles.put("SeniorDeveloper","SeniorDeveloper");
	roles.put("JuniorDeveloper", "JuniorDeveloper");
	model.addAttribute("roles", roles);

	return "userform";
	}
	
	@PostMapping("/add")
	public String reguser(@Valid @ModelAttribute User user, BindingResult result,RedirectAttributes attributes ) {
		
		if(result.hasErrors()) {
			return "userform";
		}
		
		
		attributes.addFlashAttribute("user", user);
		return "redirect:/userDetails";
		
	}
	
	@GetMapping("/userDetails")
	public String success() {
		return "details-user";
		
	}
	
	
}
