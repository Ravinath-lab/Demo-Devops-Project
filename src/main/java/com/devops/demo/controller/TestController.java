package com.devops.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {
	
	@GetMapping(path = "/welcome/{name}")
	public ResponseEntity<String> welcomeUser(@PathVariable(name = "name")String name){
		return ResponseEntity.ok("Hiiiii "+name+" !");
	}

}
