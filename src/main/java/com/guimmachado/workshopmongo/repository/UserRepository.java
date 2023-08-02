package com.guimmachado.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guimmachado.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
