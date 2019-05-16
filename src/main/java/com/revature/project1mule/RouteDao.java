package com.revature.project1mule;

public class RouteDao {

	private static RouteDao uniqueInstance;
	
	public static RouteDao getDao(){
		if (uniqueInstance == null) uniqueInstance = new RouteDao();
		return uniqueInstance;
	}
	
	private RouteDao(){
		
	}
	
	/*
	 *  requested_range
	 *  aircraft_id
	 *  aircraft_useful_load
	 *  aircraft_range
	 *  pilot_id
	 *  aircraft_speed
	 *  pilot_age
	 *  pilot_name
	 *  aircraft_name
	 *  aircraft_passenger_capacity
	 *  requested_passengers
	 *  name
	 */
	
	public void insert(int rr, Object ai, Object aul, Object ar, Integer pi, Object as, int pa, String pn, Object an, Object apc, int rp, String rn){
		
	}
	
	public boolean pilotAssigned(int pi){
		return false;
	}
	
}
