package com.agustin.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	//@RequestMapping(method=RequestMethod.GET, path = "/hello-world") same as 
	@GetMapping( path = "/hello-world")
	public String helloWorld() {
		return "Hello Worlds"; //Returns a String
	}
	
	@GetMapping( path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("You are my world");//Returns a bean converted to JSON
	}
	
	@GetMapping( path = "/hello-world-path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format ("Hello Worlds, %s", name));//%replaced by name
	}
}
