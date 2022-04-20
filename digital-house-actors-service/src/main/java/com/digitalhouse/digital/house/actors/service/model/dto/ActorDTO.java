package com.digitalhouse.digital.house.actors.service.model.dto;

import com.digitalhouse.digital.house.actors.service.model.entity.ActorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public ActorDTO(ActorEntity actor) {
        this.cdActor = actor.getCdActor();
        this.nmActor = actor.getNmActor();
        this.tpActor = actor.getTpActor();

    }

    private String cdActor;
    private String nmActor;
    private String tpActor;
}
