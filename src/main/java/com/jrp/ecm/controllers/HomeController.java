package com.jrp.ecm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jrp.ecm.dao.ProductRepository;
import com.jrp.ecm.dao.UserRepository;
import com.jrp.ecm.entities.Product;
import com.jrp.ecm.entities.User;

@Controller
public class HomeController {

	@Autowired
	ProductRepository proRepo;

	@Autowired
	UserRepository uRepo;

	@GetMapping("/")
	public String displayHome(Model model) {

		List<Product> products = proRepo.findAll();
		model.addAttribute("productsList", products);

		List<User> users = uRepo.findAll();
		model.addAttribute("usersList", users);
		return "main/home";
	}
}
