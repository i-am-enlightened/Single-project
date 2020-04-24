package com.zensar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping("/")
	public String WelcomeController() {
		// TODO Auto-generated constructor stub
		return "<h1> Product Management Application </h1>";
	}

}
