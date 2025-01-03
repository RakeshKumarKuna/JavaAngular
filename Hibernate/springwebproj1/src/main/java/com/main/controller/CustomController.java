package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.main.entity.User;

@Controller
public class CustomController {
  @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
	public String goHome(Model model) {
	  model.addAttribute("user", new User());
	  System.out.println("request hit");
		return "index";
	}
	  @PostMapping("/formData") 
	  public String formSubmit(@ModelAttribute("user") User user,RedirectAttributes attr )
	  {
		  System.out.println(user);
		  String msg="Date Submited with email "+user.getEmail();
		  attr.addFlashAttribute("msg", msg);
		  return "redirect:/home"; 
		  }
	  @GetMapping("/getdata{id}")
     public String getData(@RequestParam("id") int id) {
		  System.out.println("data from get method "+id);
    	 return "index";
     }
	  
}
