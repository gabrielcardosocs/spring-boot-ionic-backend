package com.gabrielcardoso.cursomc.services.exceptions;

public class DataIntergrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntergrityException(String msg) {
		super(msg);
	}
	
	public DataIntergrityException(String msg, Throwable cause)  {
		super(msg,cause);
	}
}
