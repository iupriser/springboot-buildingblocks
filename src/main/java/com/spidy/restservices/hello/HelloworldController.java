package com.spidy.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloworldController {
	// Simple Method
	// URI - /helloworld
	// GET
//	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping(path = "/helloworld1")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Deepak", "Sharma", "Noida");
	}
}
