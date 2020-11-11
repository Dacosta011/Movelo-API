package com.init.moveloapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proxy")
public class ProxyPeti {
	
	private  Proxy pro;
	
	@RequestMapping(value = "registro", method = RequestMethod.POST)
	public ResponseEntity<?> registro(@RequestBody String info) {
		pro = Proxy.getInstance();
		return pro.registro(info);
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody String info) {
		pro = Proxy.getInstance();
		return pro.login(info);
	}

}
