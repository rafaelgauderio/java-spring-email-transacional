package com.rafaeldeluca.controllers.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private String error;
	private String message;
	private String path;
	private Integer httpStatus;
	private Instant timespamp;

	public StandardError() {

	}

	public StandardError(String error, String message, String path, Integer httpStatus, Instant timespamp) {
		super();
		this.error = error;
		this.message = message;
		this.path = path;
		this.httpStatus = httpStatus;
		this.timespamp = timespamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Instant getTimespamp() {
		return timespamp;
	}

	public void setTimespamp(Instant timespamp) {
		this.timespamp = timespamp;
	}	
	

}
