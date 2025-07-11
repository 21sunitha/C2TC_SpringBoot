package com.tnsif.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/hello")
	public String welcome() {
		return "Hai coders from RestFul";
	}
	@GetMapping("/hello/{name}")
	public String Greet(@PathVariable String name) {
		return "hello "+name+" welcome";
	}
	@GetMapping("/hello")
	public String message(@RequestParam String name) {
		return "Message is "+name;
		
	}

}
