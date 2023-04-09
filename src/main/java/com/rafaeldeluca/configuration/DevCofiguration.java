package com.rafaeldeluca.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rafaeldeluca.services.EmailService;
import com.rafaeldeluca.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevCofiguration {
	
	// criando um bean para a interface EmailService
	
	@Bean
	public EmailService emailService() {
		
		return new SendGridEmailService();
	}
		

}
