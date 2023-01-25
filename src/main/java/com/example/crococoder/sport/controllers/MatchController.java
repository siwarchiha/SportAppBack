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

import com.example.crococoder.sport.models.Matche;
import com.example.crococoder.sport.services.MatchService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/matches")
public class MatchController {
	@Autowired 
	private MatchService matchServ;
	
	@GetMapping
	public List<Matche> getAllMatches(){
		return matchServ.getAllMatches();
		
	}
	@GetMapping("/{id}")
	public Matche getMatchById(@PathVariable Long id) {
		return matchServ.getMatchBydId(id);
	}
	@PostMapping
	public Matche addMacth(@RequestBody Matche m) {
		return matchServ.addMatch(m);
	} 
	
	@PutMapping
	public Matche editMatch(@RequestBody Matche m) {
		return matchServ.editMatch(m);
	}
	@DeleteMapping("/{id}")
	public void deleteMatchById(@PathVariable Long id) {
		 matchServ.deleteMatchById(id);
	}
	
	
	
	
	

}
