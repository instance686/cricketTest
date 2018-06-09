package com.cricbuzz.test.sample.cricbuzztest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricbuzz.test.sample.cricbuzztest.model.Player;
import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBatting;
import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBowling;
import com.cricbuzz.test.sample.cricbuzztest.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@PostMapping(value ="/api/player",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> createPlayer(@RequestBody Player player) {
		return new ResponseEntity<String>(playerService.addPlayer(player), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/player/{id}")
	public ResponseEntity<String> updatePlayer(@PathVariable("id") Long id) {
		return new ResponseEntity<String>(playerService.getPlayerById(id), HttpStatus.OK);
	}
	
	@PutMapping(value ="/api/player",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> updatePlayer(@RequestBody Player player) {
		return new ResponseEntity<String>(playerService.updatePlayer(player), HttpStatus.OK);
	}
	
	@DeleteMapping("/api/player")
	public ResponseEntity<String> deletePlayer(@RequestParam Long id) {
		return new ResponseEntity<String>(playerService.deletePlayer(id), HttpStatus.OK);
	}
	
	@PostMapping(value ="/api/player/batting/stats",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> insertBattingStats(@RequestBody PlayerStatsBatting playerBattingStats) {
		return new ResponseEntity<String>(playerService.insertBattingStats(playerBattingStats), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/player/batting/stats/{id}")
	public ResponseEntity<String> getPlayerBattingStats(@PathVariable("id") Long playerId) {
		return new ResponseEntity<String>(playerService.getPlayerBattingStats(playerId), HttpStatus.OK);
	}
	
	@PutMapping(value ="/api/player/batting/stats",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> updatePlayerBattingStats(@RequestBody PlayerStatsBatting playerBattingStats) {
		return new ResponseEntity<String>(playerService.updatePlayerBattingStats(playerBattingStats), HttpStatus.OK);
	}
	
	@DeleteMapping("/api/player/batting/stats")
	public ResponseEntity<String> deletePlayerBattingStatsById(@RequestParam Long statsid) {
		return new ResponseEntity<String>(playerService.deletePlayerBattingStats(statsid), HttpStatus.OK);
	}
	
	@PostMapping(value ="/api/player/bowling/stats",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> insertBowlingStats(@RequestBody PlayerStatsBowling playerBowlingStats) {
		return new ResponseEntity<String>(playerService.insertBowlingStats(playerBowlingStats), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/player/bowling/stats/{id}")
	public ResponseEntity<String> getPlayerBowlingStats(@PathVariable("id") Long playerId) {
		return new ResponseEntity<String>(playerService.getPlayerBowlingStats(playerId), HttpStatus.OK);
	}
	
	@PutMapping(value ="/api/player/bowling/stats",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> updatePlayerBowlingStats(@RequestBody PlayerStatsBowling playerBowlingStats) {
		return new ResponseEntity<String>(playerService.updatePlayerBowlingStats(playerBowlingStats), HttpStatus.OK);
	}
	
	@DeleteMapping("/api/player/bowling/stats")
	public ResponseEntity<String> deletePlayerBowlingStatsById(@RequestParam Long statsid) {
		return new ResponseEntity<String>(playerService.deletePlayerBowlingStats(statsid), HttpStatus.OK);
	}

	
}
