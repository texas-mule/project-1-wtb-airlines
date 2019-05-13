package com.revature.project1mule.flightschool.flowHelpers;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.revature.project1mule.flightschool.responsePojos.PilotList;

public class GetPilotID implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		PilotList requestObject = (PilotList) eventContext.getMessage().getPayload();
		eventContext.getMessage().setInvocationProperty("pilotid", requestObject.getResults().get(0).getId());
		return null;
	}

}
