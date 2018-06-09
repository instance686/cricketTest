package com.cricbuzz.test.sample.cricbuzztest.service;

import com.cricbuzz.test.sample.cricbuzztest.model.Player;
import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBatting;
import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBowling;

public interface PlayerService {

	String addPlayer(Player player);

	String updatePlayer(Player player);

	String getPlayerById(Long id);

	String getPlayerByName(String name);

	String deletePlayer(Long id);

	String insertBattingStats(PlayerStatsBatting playerBattingStats);

	String getPlayerBattingStats(Long id);

	String updatePlayerBattingStats(PlayerStatsBatting playerBattingStats);

	String deletePlayerBattingStats(Long id);
	
	String insertBowlingStats(PlayerStatsBowling playerBattingStats);

	String getPlayerBowlingStats(Long id);

	String updatePlayerBowlingStats(PlayerStatsBowling playerBattingStats);

	String deletePlayerBowlingStats(Long id);

}
