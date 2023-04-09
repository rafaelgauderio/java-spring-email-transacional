package com.rafaeldeluca.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaeldeluca.dto.EmailDTO;
import com.rafaeldeluca.services.exceptions.EmailException;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

@Service
public class EmailService {

	// objeto de log paa testar
	private static Logger LOG = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private SendGrid sendGrid;

	public void sendEmail(EmailDTO emailDTO) {

		Email from = new Email(emailDTO.getFromEmail(), emailDTO.getFromName());
		Email to = new Email(emailDTO.getTo());
		Content content = new Content(emailDTO.getContentType(), emailDTO.getBody());

		Mail sendGridMail = new Mail(from, emailDTO.getSubject(), to, content);

		Request sendGridRequest = new Request();

		try {

			sendGridRequest.setMethod(Method.POST);
			sendGridRequest.setEndpoint("mail/send"); // padrão do endpoint da API sendGrid
			sendGridRequest.setBody(sendGridMail.build());

			LOG.info("Enviando email para: " + emailDTO.getTo());

			Response response = sendGrid.api(sendGridRequest);

			// se o código http de resposta estiver entre 400 e 500 aconteceu algum erro
			if (response.getStatusCode() >= 400 && response.getStatusCode() <= 500) {
				LOG.error("Erro ao tentar enviar email: " + response.getBody());
				throw new EmailException(response.getBody());
			} else {
				LOG.info("Email enviado com sucesso. Código http: " + response.getStatusCode());

			}

		} catch (IOException error) {
			throw new EmailException(error.getMessage());
		}

	}

}
