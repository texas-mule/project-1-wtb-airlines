package com.revature.project1mule.flightschool.flowHelpers;

import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.revature.project1mule.flightschool.responsePojos.AircraftPilot;
import com.revature.project1mule.FlightSchoolAccessor;
import com.revature.project1mule.RouteDao;

public class postHelper implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) {
		int requested_range = eventContext.getMessage().getInvocationProperty("requested_range");
		int requested_passengers = eventContext.getMessage().getInvocationProperty("requested_passengers");
		String route_name = eventContext.getMessage().getInvocationProperty("route_name");
		RouteDao routeDao = RouteDao.getDao();
		FlightSchoolAccessor fsa = new FlightSchoolAccessor();
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> lacr = (List<Map<String, Object>>) eventContext.getMessage().getPayload();
		for (Map<String, Object> acr : lacr) {
			List<AircraftPilot> pilots = fsa.getPilots((String) acr.get("name"));
			if (pilots == null)
				continue;
			for (AircraftPilot pilot : pilots) {
				if (pilot == null || pilot.getId() == null)
					continue;
				if (routeDao.pilotAssigned(pilot.getId()))
					continue;
				if (routeDao.insert(requested_range, acr.get("id"), acr.get("useful_load"), acr.get("range"),
						pilot.getId(), acr.get("speed"), pilot.getAge(), pilot.getName(), acr.get("name"),
						acr.get("passenger_capacity"), requested_passengers, route_name)) {
					return routeDao.getRouteByName(route_name);
				} else {
					return "That route name is taken!";
				}
			}
			return "No pilots available!";
		}
		return "No suitable aircraft available!";
	}

}
