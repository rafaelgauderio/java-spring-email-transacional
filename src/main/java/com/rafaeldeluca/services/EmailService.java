package com.rafaeldeluca.services;

import com.rafaeldeluca.dto.EmailDTO;

public interface EmailService {
	
	// padrão de projeto  strategy
	// principio de programar para a interface e não para implementação	
	void sendEmail(EmailDTO emailDTO);

}
