package com.example.crococoder.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crococoder.sport.models.Player;
import com.example.crococoder.sport.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{

}
