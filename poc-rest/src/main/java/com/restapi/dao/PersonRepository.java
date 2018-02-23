package com.restapi.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.Person;


@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

	
	
}
