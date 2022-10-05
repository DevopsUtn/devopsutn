package com.utn.devops.controller;

import com.utn.devops.models.Player;
import com.utn.devops.services.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController()
public class PlayersController {

    @Autowired
    PlayersService playersService;

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getPlayers(){

        return new ResponseEntity<>(playersService.getPlayers(), HttpStatus.OK);
    }

}
