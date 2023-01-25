package com.example.crococoder.sport.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crococoder.sport.models.Player;
import com.example.crococoder.sport.models.Team;
import com.example.crococoder.sport.repositories.TeamRepository;
import com.example.crococoder.sport.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService{
	@Autowired
	TeamRepository teamRepo;

	@Override
	public List<Team> getAllTeams() {
		
		return teamRepo.findAll();
	}

	@Override
	public Team addTeam(Team t) {
		
		return teamRepo.save(t);
	}

	@Override
	public void deleteTeamById(Long id) {
		teamRepo.deleteById(id);
		
	}

	@Override
	public Team getTeamBydId(Long id) {
		Optional<Team> t = teamRepo.findById(id);
	    return t.isPresent() ? t.get() : null;
	}

	@Override
	public Team editTeam(Team t) {
		
		return teamRepo.save(t);
	}

}
