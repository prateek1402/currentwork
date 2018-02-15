package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dao.PersonRepository;
import com.restapi.model.Person;
import com.restapi.service.PersonService;

@RestController
@RequestMapping("/restapi")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@Autowired PersonRepository pr;
	
	@GetMapping("/all")
    public List<Person> getAll() {
        return personService.getAllPersonInfo();
    }
	@RequestMapping(method=RequestMethod.POST, value="/createperson")
    public String addPerson(@RequestBody Person person) {
		
		
		
     if(   pr.save(person)!=null)
    	 return "lol";
     else
    	 return "lol2"; 
        
    }
}
