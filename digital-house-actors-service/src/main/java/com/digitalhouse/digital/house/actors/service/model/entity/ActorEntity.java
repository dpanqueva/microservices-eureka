package com.digitalhouse.digital.house.actors.service.model.entity;

import com.digitalhouse.digital.house.actors.service.model.dto.ActorDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actors")
public class ActorEntity {

    @Id
    @Column(name = "cd_actor")
    private String cdActor;

    @Column(name = "nm_actor")
    private String nmActor;

    @Column(name = "tp_actor")
    private String tpActor;

    public ActorEntity(ActorDTO actor) {
        this.cdActor = actor.getCdActor();
        this.nmActor = actor.getNmActor();
        this.tpActor = actor.getTpActor();

    }
}
