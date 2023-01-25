package com.example.crococoder.sport.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crococoder.sport.models.Matche;
import com.example.crococoder.sport.repositories.MatchRepository;
import com.example.crococoder.sport.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService{
	@Autowired
	MatchRepository matchRepo ;
	

	@Override
	public List<Matche> getAllMatches() {
		return matchRepo.findAll();
	}

	@Override
	public Matche addMatch(Matche m) {
		return matchRepo.save(m);
	}

	@Override
	public void deleteMatchById(Long id) {
		matchRepo.deleteById(id);
		
	}

	@Override
	public Matche getMatchBydId(Long id) {
		Optional<Matche> matche = matchRepo.findById(id);
		return matche.isPresent() ? matche.get() : null ;
	}

	@Override
	public Matche editMatch(Matche m) {
		return matchRepo.save(m);
	}

}
