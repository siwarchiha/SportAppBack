package com.example.crococoder.sport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crococoder.sport.models.Team;
import com.example.crococoder.sport.services.TeamService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/teams")
public class TeamController {
	
	@Autowired 
	private TeamService teamServ;
	
	@GetMapping
	public List<Team> getAllTeams(){
		return teamServ.getAllTeams();
		
	}
	@GetMapping("/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamServ.getTeamBydId(id);
	}
	@PostMapping
	public Team addTeam(@RequestBody Team m) {
		return teamServ.addTeam(m);
	} 
	
	@PutMapping
	public Team editTeam(@RequestBody Team m) {
		return teamServ.editTeam(m);
	}
	@DeleteMapping("/{id}")
	public void deleteTeamById(@PathVariable Long id) {
		teamServ.deleteTeamById(id);
	}


}
