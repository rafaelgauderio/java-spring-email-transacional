package com.rafaeldeluca.dto;

import java.io.Serializable;

public class EmailDTO implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	private String fromEmail;
	private String fromName;
	private String  replyTo;
	private String to;
	private String subject;
	private String cotentType;
	
	public EmailDTO () {
		
	}

	public EmailDTO(String fromEmail, String fromName, String replyTo, String to, String subject, String cotentType) {
		super();
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.replyTo = replyTo;
		this.to = to;
		this.subject = subject;
		this.cotentType = cotentType;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCotentType() {
		return cotentType;
	}

	public void setCotentType(String cotentType) {
		this.cotentType = cotentType;
	}
	
	
	
	

}
