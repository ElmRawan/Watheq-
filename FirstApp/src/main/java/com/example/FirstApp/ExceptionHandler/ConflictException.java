package com.example.FirstApp.ExceptionHandler;


import org.springframework.http.HttpStatus;
public class ConflictException extends ApiBaseException {
	private static final long serialVersionUID = -3009157732242241606L;


    public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}