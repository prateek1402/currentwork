package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Person;
import com.restapi.service.PersonService;

@RestController
@RequestMapping("/rest/persons")
public class PersonController {
	@Autowired
	private PersonService personService;
	@GetMapping("/all")
    public List<Person> getAll() {
        return personService.getAllPersonInfo();
    }
}
