package com.example.crococoder.sport.services;

import java.util.List;
import java.util.Optional;

import com.example.crococoder.sport.models.Matche;

public interface MatchService {
	public List<Matche> getAllMatches();
	public Matche addMatch(Matche m);
	public void deleteMatchById(Long id);
	public Matche getMatchBydId( Long id);
	public Matche editMatch(Matche m);
	
	

}
