package com.microservices.api;

import javax.servlet.ServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping
	public String respondWithHello(ServletRequest request) {
		
		return request.getServletContext().getContextPath() + "hello";
	}
}
