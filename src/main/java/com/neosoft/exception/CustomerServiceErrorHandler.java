package com.neosoft.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.neosoft.constants.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class CustomerServiceErrorHandler {
	

	@ExceptionHandler(CustomerServiceGenericException.class)
	  public ResponseEntity<ErrorResponse> resourceNotFoundException(CustomerServiceGenericException ex, WebRequest request) {
		ErrorResponse message = new ErrorResponse();
	    
	    return new ResponseEntity<ErrorResponse>(message, HttpStatus.NOT_FOUND);
	  }

	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<ErrorResponse> globalExceptionHandler(Exception ex, WebRequest request) {
		  ErrorResponse message = new ErrorResponse();
	    
	    return new ResponseEntity<ErrorResponse>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
}