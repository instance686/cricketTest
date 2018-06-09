package com.cricbuzz.test.sample.cricbuzztest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER_STATS_BATTING")
public class PlayerStatsBatting {

	@Id
	@GeneratedValue
	Long id;
	
	Long playerId;
	
	String statsCategory;
	
	Integer noOfMatches;
	
	Integer noOfInnings;
	
	Integer runs;
	
	Integer highest;
	
	Double	average;
	 
	Integer ballsFaced;
	
	Double strikeRate;

	Integer hundreds;
	
	Integer DoubleHundreds;
	
	Integer fifty;
	
	Integer fours;
	
	Integer sixes;
	
	
	Long creationTime;
	
	Long updationTime;


	public Long getUpdationTime() {
		return updationTime;
	}


	public void setUpdationTime(Long updationTime) {
		this.updationTime = updationTime;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getPlayerId() {
		return playerId;
	}


	public void setPlayer_id(Long playerId) {
		this.playerId = playerId;
	}


	public String getStatsCategory() {
		return statsCategory;
	}


	public void setStatsCategory(String statsCategory) {
		this.statsCategory = statsCategory;
	}


	public Integer getNoOfMatches() {
		return noOfMatches;
	}


	public void setNoOfMatches(Integer noOfMatches) {
		this.noOfMatches = noOfMatches;
	}


	public Integer getNoOfInnings() {
		return noOfInnings;
	}


	public void setNoOfInnings(Integer noOfInnings) {
		this.noOfInnings = noOfInnings;
	}


	public Integer getRuns() {
		return runs;
	}


	public void setRuns(Integer runs) {
		this.runs = runs;
	}


	public Integer getHighest() {
		return highest;
	}


	public void setHighest(Integer highest) {
		this.highest = highest;
	}


	public Double getAverage() {
		return average;
	}


	public void setAverage(Double average) {
		this.average = average;
	}


	public Integer getBallsFaced() {
		return ballsFaced;
	}


	public void setBallsFaced(Integer ballsFaced) {
		this.ballsFaced = ballsFaced;
	}


	public Double getStrikeRate() {
		return strikeRate;
	}


	public void setStrikeRate(Double strikeRate) {
		this.strikeRate = strikeRate;
	}


	public Integer getHundreds() {
		return hundreds;
	}


	public void setHundreds(Integer hundreds) {
		this.hundreds = hundreds;
	}


	public Integer getDoubleHundreds() {
		return DoubleHundreds;
	}


	public void setDoubleHundreds(Integer doubleHundreds) {
		DoubleHundreds = doubleHundreds;
	}


	public Integer getFifty() {
		return fifty;
	}


	public void setFifty(Integer fifty) {
		this.fifty = fifty;
	}


	public Integer getFours() {
		return fours;
	}


	public void setFours(Integer fours) {
		this.fours = fours;
	}


	public Integer getSixes() {
		return sixes;
	}


	public void setSixes(Integer sixes) {
		this.sixes = sixes;
	}


	public Long getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}
	
	
	
}
