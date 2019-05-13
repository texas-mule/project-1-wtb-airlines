package com.revature.project1mule.flightschool.flowHelpers;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class StripUrlsToPath implements Callable {

	@Override
	public List<String> onCall(MuleEventContext eventContext) throws Exception {
		/*
		try {
			List<String> ls = (List<String>) eventContext.getMessage().getInvocationProperty("aircrafturls");
			for (String url : ls) {
				url = url.replace("https://flightschool.joshquizzes.com", "");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		return new ArrayList<String>();
	}

}
