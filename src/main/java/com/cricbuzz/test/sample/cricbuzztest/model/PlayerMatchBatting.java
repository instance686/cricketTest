package com.cricbuzz.test.sample.cricbuzztest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER_MATCH_BATTING")
public class PlayerMatchBatting {
	
	@Id
	@GeneratedValue
	Long id;
	
	Long series_id;
	
	Long match_id;
	
	Long player_id;
	
	Integer runs;
	
	Integer ballsFaced;
	
	Integer dots;
	
	Integer	 fours;
	
	Integer sixes;
	
	Integer singles;
	
	Integer twos;
	
	Integer threes;
	
	boolean  isNotOut;
	
	String inningsNumber;
	
	Long creationTime;
	
	Long updationTime;

	public Long getId() {
		return id;
	}

	public Long getSeries_id() {
		return series_id;
	}

	public Long getMatch_id() {
		return match_id;
	}

	public Long getPlayer_id() {
		return player_id;
	}

	public Integer getRuns() {
		return runs;
	}

	public Integer getBallsFaced() {
		return ballsFaced;
	}

	public Integer getDots() {
		return dots;
	}

	public Integer getFours() {
		return fours;
	}

	public Integer getSixes() {
		return sixes;
	}

	public Integer getSingles() {
		return singles;
	}

	public Integer getTwos() {
		return twos;
	}

	public Integer getThrees() {
		return threes;
	}

	public boolean isNotOut() {
		return isNotOut;
	}

	public String getInningsNumber() {
		return inningsNumber;
	}

	public Long getCreationTime() {
		return creationTime;
	}

	public Long getUpdationTime() {
		return updationTime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSeries_id(Long series_id) {
		this.series_id = series_id;
	}

	public void setMatch_id(Long match_id) {
		this.match_id = match_id;
	}

	public void setPlayer_id(Long player_id) {
		this.player_id = player_id;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public void setBallsFaced(Integer ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public void setDots(Integer dots) {
		this.dots = dots;
	}

	public void setFours(Integer fours) {
		this.fours = fours;
	}

	public void setSixes(Integer sixes) {
		this.sixes = sixes;
	}

	public void setSingles(Integer singles) {
		this.singles = singles;
	}

	public void setTwos(Integer twos) {
		this.twos = twos;
	}

	public void setThrees(Integer threes) {
		this.threes = threes;
	}

	public void setNotOut(boolean isNotOut) {
		this.isNotOut = isNotOut;
	}

	public void setInningsNumber(String inningsNumber) {
		this.inningsNumber = inningsNumber;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public void setUpdationTime(Long updationTime) {
		this.updationTime = updationTime;
	}
	
	
	
	
	

}
