package com.digitalhouse.digital.house.books.service.exceptions;

/**
 * @version 0.0.1
 * @author dpanquev
 * */
public class NotContentException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotContentException() {
		
	}
	
	public NotContentException(String message) {
		super(message);
	}
	

}
