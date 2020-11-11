package com.init.moveloapi;

import org.springframework.http.ResponseEntity;


public interface Iproxy {
	public ResponseEntity<?> login (String info);
	public ResponseEntity<?> llamado (String info);
}
