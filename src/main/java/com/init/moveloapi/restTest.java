package com.init.moveloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class restTest {
	
	
	@GetMapping
	public String hello() {
		return "hello world";
	}
}
