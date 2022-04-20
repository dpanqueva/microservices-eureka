package com.digitalhouse.digital.house.lend.lease.service.model.dto;



import com.digitalhouse.digital.house.lend.lease.service.model.enums.EResponseType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO<T> {

    private T serviceResponse;
    private EResponseType type;
    private String message;
    private String code;
}
