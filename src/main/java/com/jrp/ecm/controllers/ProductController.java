package com.jrp.ecm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.ecm.dao.ProductRepository;
import com.jrp.ecm.entities.Product;
import com.jrp.ecm.entities.User;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository proRepo;

	@GetMapping
	public String displayUsers(Model model) {
		List<Product> products = proRepo.findAll();
		model.addAttribute("productsList", products);
		return "products/list-products";
	}
	
	@GetMapping("/new")
	public String displayPruductForm(Model model) {
		Product aProduct = new Product();
		model.addAttribute("product", aProduct);
		return "products/create-product";
	}

	@PostMapping("/save")
	public String createProduct(Product product, Model model) {
		proRepo.save(product);
		return "redirect:/products/new";

	}

}
