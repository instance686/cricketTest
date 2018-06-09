package com.cricbuzz.test.sample.cricbuzztest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER_MATCH_BATTING")
public class PlayerMatchBowling {

	@Id
	@GeneratedValue
	Long id;

	Long series_id;

	Long match_id;

	Long player_id;

	Double overs;

	Integer ballsBolwed;

	Integer runsGiven;

	Integer wickets;

	Double economy;

	Integer dots;

	Integer fours;

	Integer sixes;

	Integer noBalls;

	Integer wides;

	Long creationTime;

	Long updationTime;
}
