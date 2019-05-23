package com.revature.project1mule.flightschool.responsePojos;

import java.util.List;

public class AircraftSearchResult {

	private int count;
	private String next;
	private String previous;
	private List<Aircraft> results;

	public AircraftSearchResult() {
		super();
	}

	public AircraftSearchResult(int count, String next, String previous, List<Aircraft> results) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
	}

	public String getFirstURL() {
		if (results != null && results.size() > 0)
			return results.get(0).getUrl();
		return null;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public List<Aircraft> getResults() {
		return results;
	}

	public void setResults(List<Aircraft> results) {
		this.results = results;
	}



}
