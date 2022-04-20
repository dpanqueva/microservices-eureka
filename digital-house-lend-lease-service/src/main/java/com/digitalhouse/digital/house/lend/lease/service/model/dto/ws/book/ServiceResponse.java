package com.digitalhouse.digital.house.lend.lease.service.model.dto.ws.book;

import lombok.Data;

@Data
public class ServiceResponse{
	private String tpBook;
	private Long id;
	private String nmBook;
	private Long nmVersion;
}