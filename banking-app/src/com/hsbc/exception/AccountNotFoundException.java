package com.hsbc.exception;

// Add constructors inside AccountNotFoundException
public class AccountNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AccountNotFoundException() {
		super("Sorry Account not found");
	}
	public AccountNotFoundException(String message) {
		super(message);
	}
}
