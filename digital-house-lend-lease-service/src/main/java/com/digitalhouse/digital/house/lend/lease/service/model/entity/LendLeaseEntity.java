package com.digitalhouse.digital.house.lend.lease.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lend_lease")
public class LendLeaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cd_actor")
    private String cdActor;

    @Column(name = "cd_book")
    private Long cdBook;

    @Column(name = "fe_create")
    private Date feCreate;

}
