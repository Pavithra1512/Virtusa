package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	 
	@PostMapping("/registerDemo")
	public Demo registerDemo(@RequestBody Demo demo) {
		return demoService.registerDemo(demo);
	}
}
