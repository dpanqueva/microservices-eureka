package com.digitalhouse.digital.house.actors.service.model.service;

import com.digitalhouse.digital.house.actors.service.exceptions.NotContentException;
import com.digitalhouse.digital.house.actors.service.model.dto.ActorDTO;
import com.digitalhouse.digital.house.actors.service.model.entity.ActorEntity;
import com.digitalhouse.digital.house.actors.service.model.repository.IActorRepository;
import com.digitalhouse.digital.house.actors.service.util.ActorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements IActorService {

    private static String msg = "No data found for this search";

    @Autowired
    private IActorRepository actorRepository;

    @Autowired
    private ActorUtil actorUtil;

    @Override
    public List<ActorDTO> findAll() {
        return actorUtil.convertEntityToDTOToList(actorRepository.findAll());
    }

    @Override
    public ActorDTO findByCdActor(String id) {
        ActorEntity actor = actorRepository.findByCdActor(id);
        if (actor == null) {
            throw new NotContentException(msg);
        }
        return actorUtil.convertEntityToDTO(actor);
    }

    @Override
    public ActorDTO save(ActorDTO actor) {
        return actorUtil.convertEntityToDTO(actorRepository.save(actorUtil.convertDTOToEntity(actor)));
    }

    @Override
    public ActorDTO update(ActorDTO actor, String id) {
        ActorEntity actorUpdate = actorRepository.findByCdActor(id);
        if (actorUpdate == null) {
            throw new NotContentException(msg);
        }
        actorUpdate.setNmActor(actor.getNmActor());
        actorUpdate.setTpActor(actor.getTpActor());
        return actorUtil.convertEntityToDTO(actorRepository.save(actorUpdate));
    }

    @Override
    public void delete(String id) {
        ActorEntity actorDelete = actorRepository.findByCdActor(id);
        if (actorDelete == null) {
            throw new NotContentException(msg);
        }
        actorRepository.delete(actorDelete);
    }
}
