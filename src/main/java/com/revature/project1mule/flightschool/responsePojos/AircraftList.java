package com.revature.project1mule.flightschool.responsePojos;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Aircraft List
 * <p>
 * Lists the aircraft Flight School pilots are trained to fly.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "count", "next", "previous", "results" })
public class AircraftList {

	public AircraftList() {
		super();
	}

	public AircraftList(Integer count, URI next, URI previous, List<AircraftListResult> results,
			Map<String, Object> additionalProperties) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The number of records in the result set. (Required)
	 * 
	 */
	@JsonProperty("count")
	@JsonPropertyDescription("The number of records in the result set.")
	private Integer count;
	/**
	 * Link to the next page of results. (Required)
	 * 
	 */
	@JsonProperty("next")
	@JsonPropertyDescription("Link to the next page of results.")
	private URI next;
	/**
	 * Link to the previous page of results. (Required)
	 * 
	 */
	@JsonProperty("previous")
	@JsonPropertyDescription("Link to the previous page of results.")
	private URI previous;
	/**
	 * Aircraft from the result set. (Required)
	 * 
	 */
	@JsonProperty("results")
	@JsonPropertyDescription("Aircraft from the result set.")
	private List<AircraftListResult> results = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The number of records in the result set. (Required)
	 * 
	 */
	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	/**
	 * The number of records in the result set. (Required)
	 * 
	 */
	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Link to the next page of results. (Required)
	 * 
	 */
	@JsonProperty("next")
	public URI getNext() {
		return next;
	}

	/**
	 * Link to the next page of results. (Required)
	 * 
	 */
	@JsonProperty("next")
	public void setNext(URI next) {
		this.next = next;
	}

	/**
	 * Link to the previous page of results. (Required)
	 * 
	 */
	@JsonProperty("previous")
	public URI getPrevious() {
		return previous;
	}

	/**
	 * Link to the previous page of results. (Required)
	 * 
	 */
	@JsonProperty("previous")
	public void setPrevious(URI previous) {
		this.previous = previous;
	}

	/**
	 * Aircraft from the result set. (Required)
	 * 
	 */
	@JsonProperty("results")
	public List<AircraftListResult> getResults() {
		return results;
	}

	/**
	 * Aircraft from the result set. (Required)
	 * 
	 */
	@JsonProperty("results")
	public void setResults(List<AircraftListResult> results) {
		this.results = results;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}