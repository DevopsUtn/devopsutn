package com.utn.devops.services;

import com.utn.devops.models.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PlayersService {

    public List<Player> getPlayers(){
        return createPlayers();
    }


    private List<Player> createPlayers(){
        List<Player> players = new ArrayList<>();
        Player playerUno = new Player();
        playerUno.setFirstName("Jose");
        playerUno.setLastName("Perez");
        playerUno.setBirthday(new Date());
        Player playerDos = new Player();
        playerDos.setFirstName("Jose");
        playerDos.setLastName("Perez");
        playerDos.setBirthday(new Date());
        players.add(playerUno);
        players.add(playerDos);
        return players;
    }


}
