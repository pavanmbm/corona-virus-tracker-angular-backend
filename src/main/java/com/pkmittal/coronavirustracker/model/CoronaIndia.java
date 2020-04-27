package com.pkmittal.coronavirustracker.model;

import java.util.List;

public class CoronaIndia {

	public List<DailyData> cases_time_series;
	
	public List<LocationStats> statewise;

	public List<DailyData> getCases_time_series() {
		return cases_time_series;
	}

	public void setCases_time_series(List<DailyData> cases_time_series) {
		this.cases_time_series = cases_time_series;
	}

	public List<LocationStats> getStatewise() {
		return statewise;
	}

	public void setStatewise(List<LocationStats> statewise) {
		this.statewise = statewise;
	}
	
	
}
