package com.exam.exception;

public class ItemCodeException extends Exception {

	private static final long serialVersionUID = 1L;

	public ItemCodeException() {
		super("Item code already Exists.");
	}
	public ItemCodeException(String message) {
		super(message);
	}
}
