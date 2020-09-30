package com.hsbc.exception;

public class AuthenticationException extends Exception{

	public AuthenticationException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AuthenticationException() {
		super("Sorry Authentication error.");
	}
}
