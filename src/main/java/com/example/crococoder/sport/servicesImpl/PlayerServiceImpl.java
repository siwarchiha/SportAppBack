package com.example.crococoder.sport.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crococoder.sport.models.Player;
import com.example.crococoder.sport.repositories.PlayerRepository;
import com.example.crococoder.sport.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Autowired
	PlayerRepository playerRepo;

	@Override
	public List<Player> getAllPlayers() {
		
		return playerRepo.findAll();
	}

	@Override
	public Player addPlayer(Player m) {
		
		return playerRepo.save(m);
	}

	@Override
	public void deletePlayerById(Long id) {
		playerRepo.deleteById(id);
		
	}

	@Override
	public Player getPlayerBydId(Long id) {
		Optional<Player> p = playerRepo.findById(id);
	    return p.isPresent() ? p.get() : null;
	}

	@Override
	public Player editPlayer(Player m) {
		
		return playerRepo.save(m);
	}

}
