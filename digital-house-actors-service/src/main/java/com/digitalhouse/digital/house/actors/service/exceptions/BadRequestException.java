package com.digitalhouse.digital.house.actors.service.exceptions;

/**
 * @version 0.0.1
 * @author dpanquev
 * */
public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequestException() {

	}

	public BadRequestException(String message) {
		super(message);
	}

}
