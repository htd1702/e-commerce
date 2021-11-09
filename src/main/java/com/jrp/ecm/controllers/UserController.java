package com.jrp.ecm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.ecm.dao.UserRepository;
import com.jrp.ecm.entities.User;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository uRepo;
	
	@GetMapping
	public String displayUsers(Model model) {
		List<User> users = uRepo.findAll();
		model.addAttribute("usersList", users);
		return "users/list-users";
	}
	
	@GetMapping("/new")
	public String displayUserForm(Model model) {
		User auser = new User();
		model.addAttribute("user", auser);
		return "users/create-user";
	}
	
	@PostMapping("/save")
	public String createUser(User user, Model model) {
		uRepo.save(user);
		return "redirect:/users/new";

	}
	
	
}
