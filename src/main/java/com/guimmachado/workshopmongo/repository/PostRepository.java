package com.guimmachado.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guimmachado.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
}
