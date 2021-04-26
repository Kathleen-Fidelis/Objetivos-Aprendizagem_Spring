package com.helloworld.helloobjetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloobjetivos")
public class HelloObjetivosController {

	@GetMapping
	public String helloobjetivos() {
		return "Entender as funcionalidades do Spring e do Postman.";
	}
}
