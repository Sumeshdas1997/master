package com.neosoft.constants;

import org.springframework.http.HttpStatus;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum CustomerErrorConstant {
	
	USER_DELETED_SUCCESSFULLY("S501",HttpStatus.OK,"USER DELETED SUCCESSFUL.."),
	USER_UPDATED_SUCCESSFULLY("S502",HttpStatus.OK,"USER UPDATED SUCCESSFUL.."),
	USER_NOT_FOUND("E5066",HttpStatus.NOT_FOUND,"SORRY USER NOT FOUND"),
	INVALID_PINCODE("E5067", HttpStatus.BAD_REQUEST,"Pincode is not correct/not matching"),
	INVALID_PAGINATION_PARAMS("E5068", HttpStatus.BAD_REQUEST, "Pagination params should be greater than 0."),
	INVALID_SEARCH_LENGTH("E5069", HttpStatus.BAD_REQUEST, "Search keyword should be greater than 3 characters."),
	INVALID_FILTER_CONVERSION("E5070", HttpStatus.INTERNAL_SERVER_ERROR, "Invalid conversion from OnboardingStatus to OnboardingStatusFilter."),
	NOT_VALID_FIRSTNAME("E5070", HttpStatus.BAD_REQUEST, "First Name not correct");
	
    private String errorCode;
	private HttpStatus status;
	private String errorMessage;
	
	CustomerErrorConstant(String errorCode, HttpStatus status, String errorMessage) {
		this.errorCode = errorCode;
		this.status = status;
		this.errorMessage = errorMessage;
	}
	
	public static CustomerErrorConstant getError(String errorCode, HttpStatus status) {
		return Arrays.stream(CustomerErrorConstant.values())
		.filter(e->e.getErrorCode().equalsIgnoreCase(errorCode))
		.filter(e->e.getStatus() == status)
		.findFirst()
		.orElseThrow(IllegalArgumentException::new);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
}
