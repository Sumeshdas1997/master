package com.neosoft.constants;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	private int statusCode;
	  private Date timestamp;
	  private String message;
	  private String description;
	  
	  

	  public void ErrorMessage(int statusCode, Date timestamp, String message, String description) {
	    this.statusCode = statusCode;
	    this.timestamp = timestamp;
	    this.message = message;
	    this.description = description;
	  }

	  public int getStatusCode() {
	    return statusCode;
	  }

	  public Date getTimestamp() {
	    return timestamp;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public String getDescription() {
	    return description;
	  }

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	  
	  
	}