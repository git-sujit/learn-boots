package com.sks.learn.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// SpringMVC controller: org.springframework.web package
@RestController
public class HelloController {
	// Default HTTP method is GET, so no need to Map
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
