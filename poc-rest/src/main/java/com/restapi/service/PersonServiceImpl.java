package com.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dao.PersonRepository;
import com.restapi.model.Person;
import com.restapi.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	
	
	
	@Autowired
	PersonRepository pr;
	public List<Person> getAllPersonInfo()
	
	{
		return pr.findAll();
	}


}
