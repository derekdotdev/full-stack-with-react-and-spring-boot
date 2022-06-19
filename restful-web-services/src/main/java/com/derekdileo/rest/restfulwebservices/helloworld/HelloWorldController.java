package com.derekdileo.rest.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Allow requests from localhost port 4200 (front end)
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

	// @RequestMapping works, but is more verbose than @<HttpVerb>Mapping
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
//		throw new RuntimeException("Something went wrong!");
				return new HelloWorldBean(String.format("Hello World, %s", name));
	} 
	

}
