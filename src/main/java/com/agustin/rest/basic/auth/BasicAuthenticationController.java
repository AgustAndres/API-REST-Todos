package com.agustin.rest.basic.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {	
	@GetMapping( path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticated");//Returns a bean converted to JSON
	}
}
