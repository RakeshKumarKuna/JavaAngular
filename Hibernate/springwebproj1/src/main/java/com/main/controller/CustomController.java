package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.entity.User;

@Controller
public class CustomController {
  @GetMapping("/")
	public String goHome(Model model) {
	  model.addAttribute("user", new User());
	  System.out.println("request hit");
		return "index";
	}
	
	  @PostMapping("/formData") 
	  public String formSubmit(@ModelAttribute("user") User user )
	  {
		  System.out.println(user); 
		  return "result"; 
		  }
	 
}
