package com.udemycourse.spring5tutorial.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloController {
	
	/*@Value("${app.name}") //app.name La hice igual a Juan Velasquez en aoplication.controller
	private String appName;
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}

}
