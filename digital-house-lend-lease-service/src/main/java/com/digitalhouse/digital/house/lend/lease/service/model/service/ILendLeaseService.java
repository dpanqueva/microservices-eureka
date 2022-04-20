package com.digitalhouse.digital.house.lend.lease.service.model.service;

import com.digitalhouse.digital.house.lend.lease.service.model.dto.ActorBookDTO;

public interface ILendLeaseService {

    public ActorBookDTO findInfoBookById(Long idBook, String cdActor);
}
