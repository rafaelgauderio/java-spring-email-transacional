package com.rafaeldeluca.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.dto.EmailDTO;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {
	
	@PostMapping
	public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO) {
		
		return ResponseEntity.noContent().build();
		
	}

}
