package com.codingdojo.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.projectmanager.models.User;

public interface UserRepository extends CrudRepository <User, Long>{
	
}
