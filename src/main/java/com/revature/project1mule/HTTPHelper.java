package com.revature.project1mule;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class HTTPHelper {

	String httpGetHelper(String targetUrl) {
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
