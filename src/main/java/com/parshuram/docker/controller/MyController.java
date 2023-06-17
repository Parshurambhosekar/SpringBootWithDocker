package com.parshuram.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private Logger logger=LoggerFactory.getLogger(MyController.class);

	@GetMapping("/welcome")
	public String getMessage() {

		logger.info("getMessage() method Executed...");
		
		logger.info("Return The Docker Message....");
		
		return "Hi We Deployed Spring Boot Application To Docker.....";
	}

	@GetMapping("/welcome/{name}")
	public String getMsg(@PathVariable String name) {

		logger.info("getMsg() Method Executed....");
		
		logger.info("Returning Path Variable Name with message...");
		
		return name + ", Successfully Deployed SpringBoot Application To Docker Container...";
	}

}
