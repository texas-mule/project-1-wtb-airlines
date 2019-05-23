package com.revature.project1mule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OpenCageAccessor {

	public int getRange(String a, String b, String OpenCageAPIKey) {
		Pattern p = Pattern.compile("^.*geometry....lat..(.*)..lng..(.*).....status.*$");
		HTTPHelper hh = new HTTPHelper();
		String PointASearchJSON = hh
				.httpGetHelper("https://api.opencagedata.com/geocode/v1/json?q=" + a.replaceAll(" ", "%20") + "&key=" + OpenCageAPIKey);
		PointASearchJSON = PointASearchJSON.replaceAll("\n", "");
		String PointBSearchJSON = hh
				.httpGetHelper("https://api.opencagedata.com/geocode/v1/json?q=" + b.replaceAll(" ", "%20") + "&key=" + OpenCageAPIKey);
		PointBSearchJSON = PointBSearchJSON.replaceAll("\n", "");
		PointASearchJSON = PointASearchJSON.replaceAll("\n", "");
		if (PointASearchJSON == null || PointBSearchJSON == null)
			return 0;
		Matcher matchA = p.matcher(PointASearchJSON);
		Matcher matchB = p.matcher(PointBSearchJSON);
		if (!matchA.matches() || !matchB.matches())
			return 0;
		double latA = Double.parseDouble(matchA.group(1));
		double lngA = Double.parseDouble(matchA.group(2));
		double latB = Double.parseDouble(matchB.group(1));
		double lngB = Double.parseDouble(matchB.group(2));

		return (int) range(latA, latB, lngA, lngB);
	}

	private double range(double lat1, double lat2, double lon1, double lon2) {
		final int R = 6371; // Radius of the earth
		double latDistance = Math.toRadians(lat2 - lat1);
		double lonDistance = Math.toRadians(lon2 - lon1);
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c * 0.539957; // convert to nautical miles
		distance = Math.pow(distance, 2);
		return Math.sqrt(distance);
	}

}
