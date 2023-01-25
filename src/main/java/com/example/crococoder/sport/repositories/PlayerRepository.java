package com.example.crococoder.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crococoder.sport.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
