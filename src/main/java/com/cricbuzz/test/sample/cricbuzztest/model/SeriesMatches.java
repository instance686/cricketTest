package com.cricbuzz.test.sample.cricbuzztest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERIES_MATCHES")
public class SeriesMatches {
	
	@Id
	@GeneratedValue
	Long id;
	
	Long series_id;
	
	String seriesMatchCategory;
		
	Long matchStartDate;
	
	Long matchEndDate;
	
	boolean isMatchOngoing;
	
	Long matchNumber;
	
	String matchStartTimmings;
	
	String expectedEndTime;
	
	String groundName;

	String stateName;
	
	String hostCountry;

	Long creationTime;
	
	Long updationTime;	
	
	
	public Long getId() {
		return id;
	}

	public Long getSeries_id() {
		return series_id;
	}

	public String getSeriesMatchCategory() {
		return seriesMatchCategory;
	}

	public Long getMatchNumber() {
		return matchNumber;
	}

	public Long getMatchStartDate() {
		return matchStartDate;
	}

	public Long getMatchEndDate() {
		return matchEndDate;
	}

	public boolean isMatchOngoing() {
		return isMatchOngoing;
	}

	public String getMatchStartTimmings() {
		return matchStartTimmings;
	}

	public String getExpectedEndTime() {
		return expectedEndTime;
	}

	public String getGroundName() {
		return groundName;
	}

	public String getStateName() {
		return stateName;
	}

	public String getHostCountry() {
		return hostCountry;
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

	public void setSeriesMatchCategory(String seriesMatchCategory) {
		this.seriesMatchCategory = seriesMatchCategory;
	}

	public void setMatchNumber(Long matchNumber) {
		this.matchNumber = matchNumber;
	}

	public void setMatchStartDate(Long matchStartDate) {
		this.matchStartDate = matchStartDate;
	}

	public void setMatchEndDate(Long matchEndDate) {
		this.matchEndDate = matchEndDate;
	}

	public void setMatchOngoing(boolean isMatchOngoing) {
		this.isMatchOngoing = isMatchOngoing;
	}

	public void setMatchStartTimmings(String matchStartTimmings) {
		this.matchStartTimmings = matchStartTimmings;
	}

	public void setExpectedEndTime(String expectedEndTime) {
		this.expectedEndTime = expectedEndTime;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setHostCountry(String hostCountry) {
		this.hostCountry = hostCountry;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public void setUpdationTime(Long updationTime) {
		this.updationTime = updationTime;
	}

}
