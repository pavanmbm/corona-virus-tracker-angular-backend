package com.pkmittal.coronavirustracker.rest;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkmittal.coronavirustracker.model.CoronaIndia;
import com.pkmittal.coronavirustracker.model.LocationStats;
import com.pkmittal.coronavirustracker.model.MasterData;
import com.pkmittal.coronavirustracker.service.CoronaVirusTrackerService;

@CrossOrigin
@RestController
public class CoronaVirusTrackerController {

	@Autowired
	CoronaVirusTrackerService coronaService;

	@GetMapping
	@RequestMapping(value = "/coronaStats")
	public MasterData fetchWorldData() throws IOException, InterruptedException, JSONException {
		List<LocationStats> allStats = coronaService.fetchVirusData();
		CoronaIndia coronaIndia = coronaService.fetchIndiaData();
		MasterData masterData = new MasterData();
		masterData.setWorldStats(allStats);
		masterData.setIndiaStats(coronaIndia);
		
	/*	model.addAttribute("confirmedIndia", format.format(Integer.valueOf(indiaStates.get(0).getConfirmed())));
		model.addAttribute("activeIndia", format.format(Integer.valueOf(indiaStates.get(0).getActive())));
		model.addAttribute("deathsIndia", format.format(Integer.valueOf(indiaStates.get(0).getDeaths())));
		model.addAttribute("recoveredIndia", format.format(Integer.valueOf(indiaStates.get(0).getRecovered())));
		indiaStates.remove(0);
		model.addAttribute("confirmedIndiaDelta", "+"+String.valueOf(Integer.valueOf(dailyData.get(dailyData.size()-1).getTotalconfirmed()) - Integer.valueOf(dailyData.get(dailyData.size()-2).getTotalconfirmed())));
		model.addAttribute("deathsIndiaDelta", "+"+String.valueOf(Integer.valueOf(dailyData.get(dailyData.size()-1).getTotaldeceased()) - Integer.valueOf(dailyData.get(dailyData.size()-2).getTotaldeceased())));
		model.addAttribute("recoveredIndiaDelta", "+"+String.valueOf(Integer.valueOf(dailyData.get(dailyData.size()-1).getTotalrecovered()) - Integer.valueOf(dailyData.get(dailyData.size()-2).getTotalrecovered())));
		*/
		return masterData;
	}
	
	
	
}
