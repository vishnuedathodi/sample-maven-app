package com.ust.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping(value = "/sample")
    public ResponseEntity<String> hello() {
		String msg = "Hello User";
		System.out.println(msg);
        return ResponseEntity.ok(msg);
    }
	
}
