package com.exception;

public class FileHandlingException {
    private String message;
    
    public FileHandlingException(String message) {
    	this.message=message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 
}
