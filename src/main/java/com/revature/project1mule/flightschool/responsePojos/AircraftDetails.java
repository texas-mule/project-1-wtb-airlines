package com.revature.project1mule.flightschool.responsePojos;

import java.util.List;

public class AircraftDetails {

	private int id;
	private String name;
	private String certs;
	private int pilot_count;
	private String url;
	private List<AircraftPilot> pilots;

	public AircraftDetails(int id, String name, String certs, int pilot_count, String url, List<AircraftPilot> pilots) {
		super();
		this.id = id;
		this.name = name;
		this.certs = certs;
		this.pilot_count = pilot_count;
		this.url = url;
		this.pilots = pilots;
	}

	public AircraftDetails() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCerts() {
		return certs;
	}

	public void setCerts(String certs) {
		this.certs = certs;
	}

	public int getPilot_count() {
		return pilot_count;
	}

	public void setPilot_count(int pilot_count) {
		this.pilot_count = pilot_count;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<AircraftPilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<AircraftPilot> pilots) {
		this.pilots = pilots;
	}

}
