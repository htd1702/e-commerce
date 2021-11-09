package com.jrp.ecm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jrp.ecm.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	@Override
	public List<User> findAll();
}
