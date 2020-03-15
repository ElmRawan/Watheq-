package com.example.FirstApp.ExceptionHandler;


import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiBaseException {
	private static final long serialVersionUID = -3009157732242241606L;

   public NotFoundException(String message) {
       super(message);
   }

   @Override
   public HttpStatus getStatusCode() {
       return HttpStatus.NOT_FOUND;
   }
}