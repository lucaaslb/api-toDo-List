package com.lucaaslb.apitoDolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApiToDoListController {

	@GetMapping(value = "/")
	public String hello() {
		return "Welcome to 'ToDo List'";
	}

}
