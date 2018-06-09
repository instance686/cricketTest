package com.cricbuzz.test.sample.cricbuzztest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbuzz.test.sample.cricbuzztest.model.Player;
import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBatting;
import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBowling;
import com.cricbuzz.test.sample.cricbuzztest.repo.PlayerBattingStatsRepository;
import com.cricbuzz.test.sample.cricbuzztest.repo.PlayerRepository;
import com.cricbuzz.test.sample.cricbuzztest.repo.PlayerStatsBowlingRepository;
import com.cricbuzz.test.sample.cricbuzztest.utils.JSONUtils;
import com.cricbuzz.test.sample.cricbuzztest.utils.Timings;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	PlayerBattingStatsRepository playerBattingStatsRepo;

	@Autowired
	PlayerStatsBowlingRepository playerBowlingStatsRepo;

	@Override
	public String addPlayer(Player player) {
		player.setCreationTime(Timings.currentTime());
		playerRepository.save(player);
		return JSONUtils.getSuccessJson("insertion", player);
	}

	@Override
	public String updatePlayer(Player player) {
		// TODO Auto-generated method stub
		Optional<Player> player1 = playerRepository.findById(player.getId());
		if (player1.isPresent()) {
			player.setUpdationTime(Timings.currentTime());
			playerRepository.save(player);
			return JSONUtils.getSuccessJson("updation", player);
		} else {
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
		}
	}

	@Override
	public String getPlayerById(Long id) {
		Optional<Player> player = playerRepository.findById(id);
		if (player.isPresent()) {
			return JSONUtils.getSuccessJson("fetch", player.get());
		} else {
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
		}
	}

	@Override
	public String getPlayerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePlayer(Long id) {
		Optional<Player> player1 = playerRepository.findById(id);
		if (player1.isPresent()) {
			playerRepository.deleteById(id);

			return JSONUtils.getSuccessJson("deletion");
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");

	}

	@Override
	public String insertBattingStats(PlayerStatsBatting playerBattingStats) {
		Optional<Player> player = playerRepository.findById(playerBattingStats.getPlayerId());
		if (player.isPresent()) {
			playerBattingStats.setCreationTime(Timings.currentTime());
			playerBattingStatsRepo.save(playerBattingStats);
			return JSONUtils.getSuccessJson("insertion", playerBattingStats);
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");

	}

	@Override
	public String getPlayerBattingStats(Long id) {
		Optional<Player> player = playerRepository.findById(id);
		if (player.isPresent()) {
			List<PlayerStatsBatting> stats = playerBattingStatsRepo.findByPlayerId(id);
			if (stats != null)
				return JSONUtils.getSuccessJson("fetch", stats);
			else
				return JSONUtils.getFailJsonWithReason("No stats for this player");
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");

	}

	@Override
	public String updatePlayerBattingStats(PlayerStatsBatting playerBattingStats) {
		Optional<PlayerStatsBatting> playerBattingStats1=playerBattingStatsRepo.findById(playerBattingStats.getId());
		if(playerBattingStats1.isPresent()) {
		Optional<Player> player = playerRepository.findById(playerBattingStats.getPlayerId());
		if(player.isPresent()) {
			playerBattingStats.setUpdationTime(Timings.currentTime());
			playerBattingStatsRepo.save(playerBattingStats);
			return JSONUtils.getSuccessJson("updation", playerBattingStats);
		}
		else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
		}
		else {
			return JSONUtils.getFailJsonWithReason("Wrong Batting Stats ID");

		}
	}

	@Override
	public String deletePlayerBattingStats(Long id) {
		Optional<PlayerStatsBatting> playerBattingStats1=playerBattingStatsRepo.findById(id);
		if(playerBattingStats1.isPresent()) {
			playerBattingStatsRepo.deleteById(id);
			return JSONUtils.getSuccessJson("deletion");
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
	}

	@Override
	public String insertBowlingStats(PlayerStatsBowling playerBowlingStats) {
		Optional<Player> player = playerRepository.findById(playerBowlingStats.getPlayerId());
		if (player.isPresent()) {
			playerBowlingStats.setCreationTime(Timings.currentTime());
			playerBowlingStatsRepo.save(playerBowlingStats);
			return JSONUtils.getSuccessJson("insertion", playerBowlingStats);
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");

	}

	@Override
	public String getPlayerBowlingStats(Long id) {
		Optional<Player> player = playerRepository.findById(id);
		if (player.isPresent()) {
			List<PlayerStatsBowling> stats = playerBowlingStatsRepo.findByPlayerId(id);
			if (stats != null)
				return JSONUtils.getSuccessJson("fetch", stats);
			else
				return JSONUtils.getFailJsonWithReason("No stats for this player");
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
	}

	@Override
	public String updatePlayerBowlingStats(PlayerStatsBowling playerBowlingStats) {
		Optional<PlayerStatsBowling> playerBowlingStats1=playerBowlingStatsRepo.findById(playerBowlingStats.getId());
		if(playerBowlingStats1.isPresent()) {
		Optional<Player> player = playerRepository.findById(playerBowlingStats.getPlayerId());
		if(player.isPresent()) {
			playerBowlingStats.setUpdationTime(Timings.currentTime());
			playerBowlingStatsRepo.save(playerBowlingStats);
			return JSONUtils.getSuccessJson("updation", playerBowlingStats);
		}
		else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
		}
		else {
			return JSONUtils.getFailJsonWithReason("Wrong Batting Stats ID");

		}
	}

	@Override
	public String deletePlayerBowlingStats(Long id) {
		Optional<PlayerStatsBowling> playerBowlingStats1=playerBowlingStatsRepo.findById(id);
		if(playerBowlingStats1.isPresent()) {
			playerBowlingStatsRepo.deleteById(id);
			return JSONUtils.getSuccessJson("deletion");
		} else
			return JSONUtils.getFailJsonWithReason("Wrong Player id");
	}



}
