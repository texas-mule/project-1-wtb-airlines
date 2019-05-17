package com.revature.project1mule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1mule.flightschool.responsePojos.AircraftDetails;
import com.revature.project1mule.flightschool.responsePojos.AircraftPilot;
import com.revature.project1mule.flightschool.responsePojos.AircraftSearchResult;

public class FlightSchoolAccessor {

	public List<AircraftPilot> getPilots(String aircraftName) {
		ObjectMapper mapper = new ObjectMapper();
		String aircraftSearchJSON = httpGetHelper(
				"https://flightschool.joshquizzes.com/flightschool/api/aircraft?search="
						+ aircraftName.replaceAll(" ", "%20"));
		if (aircraftSearchJSON == null)
			return null;
		AircraftSearchResult asr;
		try {
			asr = mapper.readValue(aircraftSearchJSON, AircraftSearchResult.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		if (asr.getFirstURL() == null)
			return null;
		String aircraftDetailsJSON = httpGetHelper(asr.getFirstURL());
		AircraftDetails ad;
		try {
			ad = mapper.readValue(aircraftDetailsJSON, AircraftDetails.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return ad.getPilots();
	}

	private String httpGetHelper(String targetUrl) {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(new URL(targetUrl).openStream()));
			StringBuilder response = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append("\n");
			}
			rd.close();
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
