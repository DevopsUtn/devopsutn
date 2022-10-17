package com.utn.devops.services.impl;

import com.utn.devops.models.entities.Player;
import com.utn.devops.repositories.PlayersRepository;
import com.utn.devops.services.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("playersService")
public class PlayersServiceImpl implements PlayersService {

    @Autowired
    PlayersRepository playersRepository;
    public List<Player> getPlayers(){
        createPlayers();
        return playersRepository.findAll();
    }
    private List<Player> createPlayers(){
        List<Player> players = new ArrayList<>();
        Player playerUno = new Player();
        playerUno.setFirstName("Raul");
        playerUno.setLastName("Fresco");
        playerUno.setBirthday(new Date());
        Player playerDos = new Player();
        playerDos.setFirstName("Jose");
        playerDos.setLastName("Perez");
        playerDos.setBirthday(new Date());
        players.add(playerUno);
        players.add(playerDos);
        playersRepository.saveAll(players);
        return players;
    }


}
