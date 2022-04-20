package com.digitalhouse.digital.house.actors.service.model.repository;


import com.digitalhouse.digital.house.actors.service.model.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity,String> {

    public ActorEntity findByCdActor(String cdActor);
}
