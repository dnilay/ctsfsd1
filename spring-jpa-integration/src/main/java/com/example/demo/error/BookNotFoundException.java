package com.example.demo.error;

@SuppressWarnings("serial")
public class BookNotFoundException extends RuntimeException {
	
	private String message;

	public BookNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	

}
