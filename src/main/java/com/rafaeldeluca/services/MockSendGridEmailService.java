package com.rafaeldeluca.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rafaeldeluca.dto.EmailDTO;
import com.rafaeldeluca.services.exceptions.EmailException;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;


public class MockSendGridEmailService implements EmailService {
	
	//implementação do método não enviar um email.
	// apenas mocka um email fake para simular um envio

	// objeto de log paa testar
	private static Logger LOG = LoggerFactory.getLogger(MockSendGridEmailService.class);
	

	public void sendEmail(EmailDTO emailDTO) {

	

			LOG.info("Enviando email para: " + emailDTO.getTo());		
			LOG.info("Email enviado com sucesso com o perfil de teste. Código http: 202." );	
	
	}

}
