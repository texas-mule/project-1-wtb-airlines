package com.revature.project1mule;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1mule.flightschool.responsePojos.AircraftDetails;
import com.revature.project1mule.flightschool.responsePojos.AircraftPilot;
import com.revature.project1mule.flightschool.responsePojos.AircraftSearchResult;

public class FlightSchoolAccessor {

	public List<AircraftPilot> getPilots(String aircraftName) {
		ObjectMapper mapper = new ObjectMapper();
		HTTPHelper hh = new HTTPHelper();
		String aircraftSearchJSON = hh
				.httpGetHelper("https://flightschool.joshquizzes.com/flightschool/api/aircraft?search="
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
		String aircraftDetailsJSON = hh.httpGetHelper(asr.getFirstURL());
		AircraftDetails ad;
		try {
			ad = mapper.readValue(aircraftDetailsJSON, AircraftDetails.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return ad.getPilots();
	}

}
