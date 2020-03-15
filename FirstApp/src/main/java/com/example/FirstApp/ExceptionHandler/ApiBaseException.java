package com.example.FirstApp.ExceptionHandler;


import org.springframework.http.HttpStatus;


public abstract class ApiBaseException extends RuntimeException {

	private static final long serialVersionUID = -3009157732242241606L;

	public ApiBaseException(String message) {
		super(message);
	}

	public abstract HttpStatus getStatusCode();
}