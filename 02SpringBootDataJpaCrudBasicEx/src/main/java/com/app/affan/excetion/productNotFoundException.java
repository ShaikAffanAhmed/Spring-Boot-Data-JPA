package com.app.affan.excetion;

public class productNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public productNotFoundException() {
		super();
	}

	public productNotFoundException(String message) {
		super(message);
	}
}
