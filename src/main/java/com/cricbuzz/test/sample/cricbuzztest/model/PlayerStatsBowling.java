package com.cricbuzz.test.sample.cricbuzztest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER_STATS_BOWLING")
public class PlayerStatsBowling {
	@Id
	@GeneratedValue
	Long id;

	Long playerId;

	String statsCategory;

	Integer noOfMatches;

	Integer noOfInnings;
	
	Integer bowlsBowled;
	
	Integer runsGiven;
	
	Integer wicketsTaken;
	
	String BBI;
	
	String BBM;
	
	Double economy;
	
	Double average;
	
	Double strikeRate;
	
	Integer fiveWicketHauls;
	
	Integer tenWicketHauls;
	
	Long creationTime;
	
	Long updationTime;
	

	public Long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

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

	public Integer getBowlsBowled() {
		return bowlsBowled;
	}

	public void setBowlsBowled(Integer bowlsBowled) {
		this.bowlsBowled = bowlsBowled;
	}

	public Integer getRunsGiven() {
		return runsGiven;
	}

	public void setRunsGiven(Integer runsGiven) {
		this.runsGiven = runsGiven;
	}

	public Integer getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(Integer wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	public String getBBI() {
		return BBI;
	}

	public void setBBI(String bBI) {
		BBI = bBI;
	}

	public String getBBM() {
		return BBM;
	}

	public void setBBM(String bBM) {
		BBM = bBM;
	}

	public Double getEconomy() {
		return economy;
	}

	public void setEconomy(Double economy) {
		this.economy = economy;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Double getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(Double strikeRate) {
		this.strikeRate = strikeRate;
	}

	public Integer getFiveWicketHauls() {
		return fiveWicketHauls;
	}

	public void setFiveWicketHauls(Integer fiveWicketHauls) {
		this.fiveWicketHauls = fiveWicketHauls;
	}

	public Integer getTenWicketHauls() {
		return tenWicketHauls;
	}

	public void setTenWicketHauls(Integer tenWicketHauls) {
		this.tenWicketHauls = tenWicketHauls;
	}
	
	
	
}
