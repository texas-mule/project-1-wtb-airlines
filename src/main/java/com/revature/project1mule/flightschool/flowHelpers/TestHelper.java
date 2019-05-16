package com.revature.project1mule.flightschool.flowHelpers;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class TestHelper implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext){
		return "{\"greeting\": \"hello\",\"amount of love\": 1000000000}";
	}
}
