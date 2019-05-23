package com.revature.project1mule.flightschool.flowHelpers;

import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.revature.project1mule.flightschool.responsePojos.AircraftPilot;
import com.revature.project1mule.FlightSchoolAccessor;
import com.revature.project1mule.RouteDao;

public class PutHelper implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) {
		int route_id = Integer.parseInt(eventContext.getMessage().getInvocationProperty("route_id"));
		RouteDao routeDao = RouteDao.getDao(eventContext.getMessage().getInvocationProperty("elephant_url"),
				eventContext.getMessage().getInvocationProperty("elephant_username"),
				eventContext.getMessage().getInvocationProperty("elephant_password"));
		int requested_range = eventContext.getMessage().getInvocationProperty("requested_range");
		int requested_passengers = eventContext.getMessage().getInvocationProperty("requested_passengers");
		FlightSchoolAccessor fsa = new FlightSchoolAccessor();
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> lacr = (List<Map<String, Object>>) eventContext.getMessage().getPayload();
		for (Map<String, Object> acr : lacr) {
			List<AircraftPilot> pilots = fsa.getPilots((String) acr.get("name"));
			if (pilots == null)
				continue;
			for (AircraftPilot pilot : pilots) {
				if (routeDao.pilotAssigned(pilot.getId()))
					continue;
				routeDao.update(requested_range, acr.get("id"), acr.get("useful_load"), acr.get("range"), pilot.getId(),
						acr.get("speed"), pilot.getAge(), pilot.getName(), acr.get("manufacturer") + " " + acr.get("name"),
						acr.get("passenger_capacity"), requested_passengers, route_id);
				return routeDao.getRouteById(route_id);
			}
		}
		return lacr;
	}

}
