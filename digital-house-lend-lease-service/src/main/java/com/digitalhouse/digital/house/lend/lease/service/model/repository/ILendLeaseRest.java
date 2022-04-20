package com.digitalhouse.digital.house.lend.lease.service.model.repository;

import com.digitalhouse.digital.house.lend.lease.service.model.entity.LendLeaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "lease")
public interface ILendLeaseRest extends JpaRepository<LendLeaseEntity, Long> {

    public LendLeaseEntity findByCdBookAndCdActor(Long cdBook, String cdActor);
}
