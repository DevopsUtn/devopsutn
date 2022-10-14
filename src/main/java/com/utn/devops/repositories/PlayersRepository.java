package com.utn.devops.repositories;

import com.utn.devops.models.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayersRepository extends JpaRepository<Player, UUID> {

}
