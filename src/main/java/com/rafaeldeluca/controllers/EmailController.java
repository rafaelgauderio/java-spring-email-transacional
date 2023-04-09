package com.rafaeldeluca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.dto.EmailDTO;
import com.rafaeldeluca.services.EmailService;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {
	
	@Autowired
	private EmailService service;
	
	@PostMapping
	public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO) {
		
		service.sendEmail(emailDTO);
		return ResponseEntity.noContent().build();
		
	}

}
