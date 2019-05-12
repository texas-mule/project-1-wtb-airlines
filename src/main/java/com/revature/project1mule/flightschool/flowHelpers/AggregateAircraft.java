package com.revature.project1mule.flightschool.flowHelpers;

import java.util.ArrayList;
import java.util.List;

import com.revature.project1mule.flightschool.responsePojos.Aircraft;

public class AggregateAircraft {

	public static List<Aircraft> aircraftList;
	static {
		aircraftList = new ArrayList<Aircraft>();
	}
	public static List<Aircraft> addAircraft(Aircraft a){
		aircraftList.add(a);
		return aircraftList;
	}
	
}
