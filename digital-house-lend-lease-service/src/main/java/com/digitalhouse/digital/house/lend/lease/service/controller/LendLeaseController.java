package com.digitalhouse.digital.house.lend.lease.service.controller;

import com.digitalhouse.digital.house.lend.lease.service.model.dto.ActorBookDTO;
import com.digitalhouse.digital.house.lend.lease.service.model.dto.ResponseDTO;
import com.digitalhouse.digital.house.lend.lease.service.model.enums.EResponseType;
import com.digitalhouse.digital.house.lend.lease.service.model.service.ILendLeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LendLeaseController {

    @Autowired
    private ILendLeaseService lendLeaseService;

    /**
     * Exist a book associate to actor
     */
    @GetMapping("/book/actor/{idBook}/{cdActor}")
    public ResponseEntity<ResponseDTO<ActorBookDTO>> findByIdBook(@PathVariable Long idBook, @PathVariable String cdActor) {
        return new ResponseEntity<>(
                new ResponseDTO<>(lendLeaseService.findInfoBookById(idBook, cdActor), EResponseType.SUCCESS
                        , "SUCCESS", "200"), HttpStatus.OK);
    }
}
