package com.jrp.ecm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jrp.ecm.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	@Override
	public List<Product> findAll();
	
}
