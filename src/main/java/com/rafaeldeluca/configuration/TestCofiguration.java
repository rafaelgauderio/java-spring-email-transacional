package com.rafaeldeluca.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rafaeldeluca.services.EmailService;
import com.rafaeldeluca.services.MockSendGridEmailService;

@Configuration
@Profile("test")
public class TestCofiguration {
	
	// configuração para enviar um email fake mocado no no perfil de teste 
	
	@Bean
	public EmailService emailService() {
		
		return new MockSendGridEmailService();
	}
		

}
