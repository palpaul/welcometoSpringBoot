package com.rahul.Welcome_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	
	
	
	private Logger logger = LoggerFactory.getLogger(myController.class);

	public myController() {
		logger.info("***** WelcomeRestController::Constructor *****");
	}
	
	@GetMapping("greet")
	public String getGreeting() {
		return "Hey Welocome to Springboot";
	}
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hey dear Welcome";
	}
	
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Hey"+ name + ", Welcome to SpringBoot App...!!";
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}

}
