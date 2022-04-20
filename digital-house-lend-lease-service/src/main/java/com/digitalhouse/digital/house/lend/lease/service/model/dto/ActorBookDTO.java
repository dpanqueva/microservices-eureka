package com.digitalhouse.digital.house.lend.lease.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActorBookDTO implements Serializable {

    private Long cdBook;

    private String nmBook;

    private String tpBook;

    private Long nmVersion;

    private String cdActor;

    private String nmActor;

    private String tpActor;

    private static final long serialVersionUID = 1L;
}
