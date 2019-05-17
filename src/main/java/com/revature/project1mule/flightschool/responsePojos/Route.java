package com.revature.project1mule.flightschool.responsePojos;

import java.sql.Date;

public class Route {

	public int requested_range;
	public int aircraft_id;
	public int aircraft_useful_load;
	public int aircraft_range;
	public int pilot_id;
	public int aircraft_speed;
	public int pilot_age;
	public String pilot_name;
	public String aircraft_name;
	public int aircraft_passenger_capacity;
	public int requested_passengers;
	public String name;
	public int id;
	public Date created;
	public Date modified;

	public Route(int requested_range, int aircraft_id, int aircraft_useful_load, int aircraft_range, int pilot_id,
			int aircraft_speed, int pilot_age, String pilot_name, String aircraft_name, int aircraft_passenger_capacity,
			int requested_passengers, String name, int id, Date created, Date modified) {
		super();
		this.requested_range = requested_range;
		this.aircraft_id = aircraft_id;
		this.aircraft_useful_load = aircraft_useful_load;
		this.aircraft_range = aircraft_range;
		this.pilot_id = pilot_id;
		this.aircraft_speed = aircraft_speed;
		this.pilot_age = pilot_age;
		this.pilot_name = pilot_name;
		this.aircraft_name = aircraft_name;
		this.aircraft_passenger_capacity = aircraft_passenger_capacity;
		this.requested_passengers = requested_passengers;
		this.name = name;
		this.id = id;
		this.created = created;
		this.modified = modified;
	}

}
