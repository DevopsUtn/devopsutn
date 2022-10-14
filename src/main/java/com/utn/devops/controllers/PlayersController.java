package com.utn.devops.controllers;

import com.utn.devops.services.impl.PlayersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PlayersController {

    @Autowired
    PlayersServiceImpl playersServiceImpl;

    @GetMapping("/players")
    public ResponseEntity<?> getPlayers(){
        return ResponseEntity.ok(playersServiceImpl.getPlayers());
    }

}
