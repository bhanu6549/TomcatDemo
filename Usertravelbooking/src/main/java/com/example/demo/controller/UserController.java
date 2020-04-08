package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entity.User;
import com.example.demo.serviceInterface.UserInterface;

@Controller

public class UserController {
	@Autowired
	private UserInterface services;
	
	@RequestMapping("/")
	public String viewIndexPage() {
		return "index";
	}
	@RequestMapping(value = "/createNewUser")
	public String createNewUserPage(Model model)
	{
		User user=new User();
		model.addAttribute("user",user);
		return "createNewUserPage";
	}
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user)
	{
		
//		System.out.println("USER DETAILS");
//		System.out.println(user.getUserName());
//		System.out.println(user.getUserAge());
		
		services.addUsers(user);
		return "redirect:/";
	}

}
