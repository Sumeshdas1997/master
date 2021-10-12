package com.neosoft.exception;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.HttpStatusCodeException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neosoft.constants.CustomerErrorConstant;
import com.neosoft.constants.ErrorResponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerServiceGenericException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private ErrorResponse errorResponse;

	private CustomerServiceGenericException(String message) {
		super(message);
	}

	public CustomerServiceGenericException(CustomerErrorConstant error) {
		super(error.getErrorCode());
		errorResponse = new ErrorResponse();
		errorResponse.setMessage(error.getErrorCode());
		errorResponse.setStatusCode(errorResponse.getStatusCode());
	}

	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}