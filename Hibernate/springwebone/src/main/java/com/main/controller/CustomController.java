package com.main.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.entity.User;

@Controller
public class CustomController {
	 @RequestMapping("/")
	    public String helloWorld(Model model) {
		 User user=new User();
		 model.addAttribute("user",user);
	        return "index";
	    }
	 @RequestMapping(value = "/formsubmit",method = RequestMethod.POST)
	 @ResponseBody
	    public String register(@ModelAttribute("user") User user) {
		 System.out.println(user);
	        return "result";
	    }
}
