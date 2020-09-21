package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.pojo.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	@Autowired
	PersonService personService;

	@GetMapping
	List<Person> queryAll() {
		return personService.queryAll();
	}

	@GetMapping("/{id}")
	Person getPerson(@PathVariable String id) {

		return personService.queryPerson(Integer.valueOf(id));
	}

}
