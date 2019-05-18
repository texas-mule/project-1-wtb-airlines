package com.revature.project1mule.flightschool.flowHelpers;

import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.revature.project1mule.flightschool.responsePojos.AircraftPilot;
import com.revature.project1mule.FlightSchoolAccessor;
import com.revature.project1mule.OpenCageAccessor;
import com.revature.project1mule.RouteDao;

public class postHelper implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) {
		int requested_range, requested_passengers;
		String route_name, point_a, point_b;
		System.out.println("onCall:  ...  ...");
		try {
			requested_range = eventContext.getMessage().getInvocationProperty("requested_range");
			requested_passengers = eventContext.getMessage().getInvocationProperty("requested_passengers");
			route_name = eventContext.getMessage().getInvocationProperty("route_name");
			point_a = eventContext.getMessage().getInvocationProperty("point_a");
			point_b = eventContext.getMessage().getInvocationProperty("point_b");
			System.out.println(route_name);
			System.out.println(point_a);
			System.out.println(point_b);
		} catch (ClassCastException e) {
			e.printStackTrace();
			return "Invalid query parameter!";
		}
		if (route_name.length() == 0) {
			if (point_a.length() == 0 || point_b.length() == 0)
				return "Missing required parameters: name or a and b";
			route_name = point_a + " to " + point_b;
		}
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> lacr = (List<Map<String, Object>>) eventContext.getMessage().getPayload();
		if (requested_range != 0) {
			if (point_a.length() != 0 || point_b.length() != 0)
				return "Range parameter not allowed when point a and point b are specified.";
		} else if (point_a.length() != 0 && point_b.length() != 0) {
			System.out.println("Line 43 reached: ...  ..   .");
			requested_range = new OpenCageAccessor().getRange(point_a, point_b,eventContext.getMessage().getInvocationProperty("opencage_apikey"));
			System.out.println(requested_range);
			final int rr = requested_range;
			lacr.removeIf(a -> (int)a.get("range") < rr);
		} else
			return "Missing required parameters: r or a and b";
		RouteDao routeDao = RouteDao.getDao(eventContext.getMessage().getInvocationProperty("elephant_url"),
				eventContext.getMessage().getInvocationProperty("elephant_username"),
				eventContext.getMessage().getInvocationProperty("elephant_password"));
		FlightSchoolAccessor fsa = new FlightSchoolAccessor();
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
