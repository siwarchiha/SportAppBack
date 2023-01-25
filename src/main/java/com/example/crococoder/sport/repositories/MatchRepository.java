package com.example.crococoder.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crococoder.sport.models.Matche;

@Repository
public interface MatchRepository extends JpaRepository<Matche, Long>{

}
