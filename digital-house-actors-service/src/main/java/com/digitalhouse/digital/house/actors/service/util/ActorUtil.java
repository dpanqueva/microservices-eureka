package com.digitalhouse.digital.house.actors.service.util;

import com.digitalhouse.digital.house.actors.service.model.dto.ActorDTO;
import com.digitalhouse.digital.house.actors.service.model.entity.ActorEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ActorUtil {

    public List<ActorDTO> convertEntityToDTOToList(List<ActorEntity> actorEntities) {
        return actorEntities.stream().map(actor -> new ActorDTO(actor.getCdActor()
                , actor.getNmActor(), actor.getTpActor())).collect(Collectors.toList());
    }

    public ActorDTO convertEntityToDTO(ActorEntity actor) {
        return new ActorDTO(actor);
    }

    public ActorEntity convertDTOToEntity(ActorDTO actor) {
        return new ActorEntity(actor);
    }

}
