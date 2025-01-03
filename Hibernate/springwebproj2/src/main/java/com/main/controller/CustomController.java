package com.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.main.entity.User;

@Controller
public class CustomController {
  @RequestMapping(value = {"/","home"})
	public String goHome(Model model) {
	  model.addAttribute("user", new User());
	  System.out.println("request hit");
		return "index";
	}
	
	  @PostMapping("/formData") 
	  public String formSubmit(@ModelAttribute("user") User user ,RedirectAttributes map)
	  {
		  System.out.println(user);
		  String msg="Thank You For Your Registration with using "+user.getEmail();
		  map.addFlashAttribute("Userdata", msg);
		  return "redirect:/home"; 
		  }
	  @GetMapping("/mail")
	  public String getemail() {
		  return "mail";
	  }
	  @PostMapping("/mailsubmit") 
	  public String submitEmail(@RequestParam("mail") String mail,@RequestParam("ph") String ph)
	  {
		  System.out.println(mail+"  "+ph);
		  return "redirect:/home"; 
		  }
	  @GetMapping("/mail/{id}") 
	  public String submitEmail(@PathVariable("id") int id)
	  {
		  System.out.println(id);
		  return "redirect:/home"; 
		  }
	  @GetMapping("/sendbulk")
	  public String sendbulkData(Map map) {
		  User user=new User();
		  user.setEmail("rakaeshkumar@gmail.com");
		  user.setPassword("454545");
		  User user1=new User();
		  user1.setEmail("rakaeshkumar@gmail.com");
		  user1.setPassword("454545");
		  map.put("data",List.of(user,user1));
	  return "jstltags";
	  }
	 
}
