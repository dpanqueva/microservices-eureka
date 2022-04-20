package com.digitalhouse.digital.house.actors.service.controller;

import com.digitalhouse.digital.house.actors.service.model.dto.ActorDTO;
import com.digitalhouse.digital.house.actors.service.model.dto.ResponseDTO;
import com.digitalhouse.digital.house.actors.service.model.enums.EResponseType;
import com.digitalhouse.digital.house.actors.service.model.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorController {

    @Autowired
    private IActorService actorService;

    @GetMapping("/list")
    public ResponseEntity<ResponseDTO<List<ActorDTO>>> myList() {
        return new ResponseEntity<>(
                new ResponseDTO<>(actorService.findAll(), EResponseType.SUCCESS
                        , "SUCCESS", "200"), HttpStatus.OK);

    }

    @GetMapping("detail/{cdActor}")
    public ResponseEntity<ResponseDTO<ActorDTO>> detail(@PathVariable String cdActor) {
        return new ResponseEntity<>(
                new ResponseDTO<>(actorService.findByCdActor(cdActor), EResponseType.SUCCESS
                        , "SUCCESS", "200"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO<ActorDTO>> create(@RequestBody ActorDTO actor) {
        return new ResponseEntity<>(
                new ResponseDTO<>(actorService.save(actor), EResponseType.SUCCESS
                        , "SUCCESS", "201"), HttpStatus.CREATED);
    }

    @PutMapping("/update/{cdActor}")
    public ResponseEntity<ResponseDTO<ActorDTO>> update(@RequestBody ActorDTO actor, @PathVariable String cdActor) {
        return new ResponseEntity<>(
                new ResponseDTO<>(actorService.update(actor, cdActor), EResponseType.SUCCESS
                        , "SUCCESS", "201"), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{cdActor}")
    public ResponseEntity<ResponseDTO<String>> delete(@PathVariable String cdActor) {
        actorService.delete(cdActor);
        return new ResponseEntity<>(
                new ResponseDTO<>("", EResponseType.SUCCESS
                        , "SUCCESS", "204"), HttpStatus.NO_CONTENT);
    }
}
