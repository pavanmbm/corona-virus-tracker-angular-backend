package com.pkmittal.coronavirustracker.model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MasterData {

	DecimalFormat format = new DecimalFormat("##,##,###");
	SimpleDateFormat dateformat = new SimpleDateFormat("dd MMMM yyyy");
	private List<LocationStats> worldStats;
	private CoronaIndia indiaStats;
	private String lastUpdated;
	private List<DailyData> last15DaysDataIndia;
	private List<LocationStats> worldStatsSortByActive;
	private List<LocationStats> worldStatsSortedByActive;
	private String worldConfirmed;
	private String worldActive;
	private String worldDeaths;
	private String worldRecovered;
	
	
	public List<LocationStats> getWorldStatsSortByActive() {
		return worldStats.stream().sorted(Comparator.comparingInt(LocationStats :: getActive).reversed()).collect(Collectors.toList());
	}
	
	public List<LocationStats> getWorldStats() {
		return worldStats;
	}
	public void setWorldStats(List<LocationStats> worldStats) {
		this.worldStats = worldStats;
	}
	public CoronaIndia getIndiaStats() {
		return indiaStats;
	}
	public void setIndiaStats(CoronaIndia indiaStats) {
		this.indiaStats = indiaStats;
	}
	public String getLastUpdated() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, -1);
		return dateformat.format(c.getTime());
	}
	public List<DailyData> getLast15DaysDataIndia() {
		return last15DaysDataIndia;
	}
	public void setLast15DaysDataIndia() {
		this.last15DaysDataIndia = indiaStats.getCases_time_series().subList(indiaStats.getCases_time_series().size()-16, indiaStats.getCases_time_series().size()-1);
	}
	public List<LocationStats> getWorldStatsSortedByActive() {
		return worldStatsSortedByActive;
	}
	public void setWorldStatsSortedByActive(List<LocationStats> worldStatsSortedByActive) {
		this.worldStatsSortedByActive = worldStatsSortedByActive;
	}
	public String getWorldConfirmed() {
		return format.format(worldStats.stream().mapToInt(p -> p.getConfirmed()).sum());
	}
	public String getWorldActive() {
		return format.format(worldStats.stream().mapToInt(p -> p.getActive()).sum());
	}
	public String getWorldDeaths() {
		return format.format(worldStats.stream().mapToInt(p -> p.getDeaths()).sum());
	}
	public String getWorldRecovered() {
		return format.format(worldStats.stream().mapToInt(p -> p.getRecovered()).sum());
	}
	public void setWorldRecovered(String worldRecovered) {
		this.worldRecovered = worldRecovered;
	}
	
	
	
	
}
