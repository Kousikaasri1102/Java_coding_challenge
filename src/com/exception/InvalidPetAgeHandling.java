package com.exception;

public class InvalidPetAgeHandling extends Exception{
    private String message;
    
    public InvalidPetAgeHandling(String message) {
    	this.message=message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 
}
