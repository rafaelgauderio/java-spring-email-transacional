package com.rafaeldeluca.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rafaeldeluca.services.exceptions.EmailException;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(EmailException.class)
	public ResponseEntity<StandardError> emailError (EmailException exception, HttpServletRequest request) {
		
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST; // código 400
		StandardError stdError = new StandardError();
		stdError.setError("Error de envio de email");
		stdError.setMessage(exception.getMessage());
		stdError.setPath(request.getRequestURI());
		stdError.setHttpStatus(httpStatus.value());
		stdError.setTimespamp(Instant.now());
		
		return ResponseEntity.status(httpStatus).body(stdError);
		
		
		
	}

}
