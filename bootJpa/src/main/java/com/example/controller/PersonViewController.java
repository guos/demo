package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.PersonService;

@Controller
@RequestMapping("person")
public class PersonViewController {
	@Autowired
	PersonService service;

	@GetMapping("/home")
	public String home(Model model) {

		model.addAttribute("allPerson", service.queryAll());

		return "personView";
	}

}
