package com.pkmittal.coronavirustracker.model;

public class LocationStats {

    private String state;
    private int confirmed;
    private int deaths;
    private int recovered;
    private int active;

    

    public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}


	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	@Override
	public String toString() {
		return "LocationStats [country=" + state + ", confirmed=" + confirmed + ", deaths="
				+ deaths + ", recovered=" + recovered + ", active=" + active + "]";
	}
	

}