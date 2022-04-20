package com.digitalhouse.digital.house.lend.lease.service.model.dto.ws.book;

import lombok.Data;

@Data
public class Response{
	private String code;
	private ServiceResponse serviceResponse;
	private String type;
	private String message;
}