package com.demo.demoamdocsbatch3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCount {
	
	@RequestMapping("/get")
	public String show() {
	    return "Welcome to Spring boot";
	}
	
	@RequestMapping("/set")
	public String showSet() {
	    return "Welcome to Another url mapping in Spring boot";
	}

}
