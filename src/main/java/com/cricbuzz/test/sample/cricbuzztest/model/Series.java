package com.cricbuzz.test.sample.cricbuzztest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERIES")
public class Series {

	
	@Id
	@GeneratedValue
	Long id;
	
	String seriesName;
	
	boolean isSeriesOngoing;
	
	Long seriesStartTime;
	
	Long seriesEndTime;
	
	String seriesStartDate;
	
	String seriesEndDate;
	
	String seriesCategory;
	
	Long creationTime;
	
	Long updationTime;
	
	

	public boolean isSeriesOngoing() {
		return isSeriesOngoing;
	}

	public void setSeriesOngoing(boolean isSeriesOngoing) {
		this.isSeriesOngoing = isSeriesOngoing;
	}

	public String getSeriesCategory() {
		return seriesCategory;
	}

	public void setSeriesCategory(String seriesCategory) {
		this.seriesCategory = seriesCategory;
	}

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

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}



	public Long getSeriesStartTime() {
		return seriesStartTime;
	}

	public void setSeriesStartTime(Long seriesStartTime) {
		this.seriesStartTime = seriesStartTime;
	}

	public Long getSeriesEndTime() {
		return seriesEndTime;
	}

	public void setSeriesEndTime(Long seriesEndTime) {
		this.seriesEndTime = seriesEndTime;
	}

	public String getSeriesStartDate() {
		return seriesStartDate;
	}

	public void setSeriesStartDate(String seriesStartDate) {
		this.seriesStartDate = seriesStartDate;
	}

	public String getSeriesEndDate() {
		return seriesEndDate;
	}

	public void setSeriesEndDate(String seriesEndDate) {
		this.seriesEndDate = seriesEndDate;
	}
	
	
}
