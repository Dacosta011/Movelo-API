package com.init.moveloapi;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class restTest {
	
	
	@GetMapping
	public String hello() {
		return "holaaaaa";
	}
	
	@PostMapping
	public ResponseEntity<user> login(@RequestBody user usuario){
		user us = new user();
		us.setCorreo(usuario.getCorreo());
		us.setClave(usuario.getClave());
		return ResponseEntity.ok(us);
	}
}
