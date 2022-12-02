package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {
	@Autowired
	private DemoRepository demoRepository;
	public Demo registerDemo(Demo demo) {
		return demoRepository.save(demo);
	}
}
