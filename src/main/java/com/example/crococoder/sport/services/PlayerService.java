package com.example.crococoder.sport.services;

import java.util.List;

import com.example.crococoder.sport.models.Player;

public interface PlayerService {
	public List<Player> getAllPlayers();
	public Player addPlayer(Player m);
	public void deletePlayerById(Long id);
	public Player getPlayerBydId( Long id);
	public Player editPlayer(Player m);

}
