package com.esprit.projet.errors;

import javax.management.RuntimeErrorException;

public class ApiRequestException extends RuntimeException {

	public ApiRequestException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ApiRequestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	


}
