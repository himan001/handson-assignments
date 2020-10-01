package com.hsbc.exception;

public class InvalidContactException extends Exception{

	public InvalidContactException(String arg) {
		super(arg);
	}
	
	public InvalidContactException() {
		super("Invalid Contact");
	}
	
}
