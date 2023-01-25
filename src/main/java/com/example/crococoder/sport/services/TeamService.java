package com.example.crococoder.sport.services;

import java.util.List;

import com.example.crococoder.sport.models.Team;

public interface TeamService {
	public List<Team> getAllTeams();
	public Team addTeam(Team m);
	public void deleteTeamById(Long id);
	public Team getTeamBydId( Long id);
	public Team editTeam(Team m);

}
