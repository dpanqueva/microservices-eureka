package com.digitalhouse.digital.house.actors.service.exceptions;

/**
 * @version 0.0.1
 * @author dpanquev
 * */
public class InternalErrorException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InternalErrorException() {
		
	}
	
	public InternalErrorException(String message) {
		super(message);
	}
	
	

}
