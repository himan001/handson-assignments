package com.exam.exception;

public class CategoryDoesntExistException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CategoryDoesntExistException() {
		super("Sorry Category Does not exist.");
		
	}

	public CategoryDoesntExistException(String message) {
		super(message);
		
	}
}
