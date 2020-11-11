package com.init.moveloapi;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class restTest {
	
	
	@GetMapping
	public String hello() {
		return "holaaaaa";
	}
	
	@PostMapping
	public ResponseEntity<?> login(@RequestBody String info){
		
		System.out.println(info);
		
		return ResponseEntity.ok(1985);
	}
}
