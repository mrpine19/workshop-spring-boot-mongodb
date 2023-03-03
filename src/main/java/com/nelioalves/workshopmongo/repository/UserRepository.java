package com.nelioalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{ //O STRING SIGNIFICA O TIPO DO ID. NO CASO, O ID É STRING
	
	

}
