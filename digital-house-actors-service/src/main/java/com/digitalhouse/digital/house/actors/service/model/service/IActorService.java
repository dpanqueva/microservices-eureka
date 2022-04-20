package com.digitalhouse.digital.house.actors.service.model.service;

import com.digitalhouse.digital.house.actors.service.model.dto.ActorDTO;
import com.digitalhouse.digital.house.actors.service.model.entity.ActorEntity;

import java.util.List;

public interface IActorService {

    public List<ActorDTO> findAll();

    public ActorDTO findByCdActor(String id);

    public ActorDTO save(ActorDTO actor);

    public ActorDTO update(ActorDTO actor,String id);

    public void delete(String actor);
}
