package com.revature.project1mule.flightschool.responsePojos;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "dob", "sex", "url", "age", "aircraft_count" })
public class CertificationPilot {

	public CertificationPilot() {
		super();
	}

	public CertificationPilot(Integer id, String name, String dob, String sex, URI url, Integer age,
			Integer aircraftCount, Map<String, Object> additionalProperties) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.url = url;
		this.age = age;
		this.aircraftCount = aircraftCount;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The unique integer identifier for this pilot. (Required)
	 * 
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("The unique integer identifier for this pilot.")
	private Integer id;
	/**
	 * The pilot's name. (Required)
	 * 
	 */
	@JsonProperty("name")
	@JsonPropertyDescription("The pilot's name.")
	private String name;
	/**
	 * The pilot's date of birth in YYYY-MM-DD format. (Required)
	 * 
	 */
	@JsonProperty("dob")
	@JsonPropertyDescription("The pilot's date of birth in YYYY-MM-DD format.")
	private String dob;
	/**
	 * The pilot's sex. (Required)
	 * 
	 */
	@JsonProperty("sex")
	@JsonPropertyDescription("The pilot's sex.")
	private String sex;
	/**
	 * The hypermedia URL for the pilot. (Required)
	 * 
	 */
	@JsonProperty("url")
	@JsonPropertyDescription("The hypermedia URL for the pilot.")
	private URI url;
	/**
	 * The pilot's age in years. (Required)
	 * 
	 */
	@JsonProperty("age")
	@JsonPropertyDescription("The pilot's age in years.")
	private Integer age;
	/**
	 * The number of aircraft this pilot has been trained and certified to fly.
	 * (Required)
	 * 
	 */
	@JsonProperty("aircraft_count")
	@JsonPropertyDescription("The number of aircraft this pilot has been trained and certified to fly.")
	private Integer aircraftCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The unique integer identifier for this pilot. (Required)
	 * 
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * The unique integer identifier for this pilot. (Required)
	 * 
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The pilot's name. (Required)
	 * 
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * The pilot's name. (Required)
	 * 
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The pilot's date of birth in YYYY-MM-DD format. (Required)
	 * 
	 */
	@JsonProperty("dob")
	public String getDob() {
		return dob;
	}

	/**
	 * The pilot's date of birth in YYYY-MM-DD format. (Required)
	 * 
	 */
	@JsonProperty("dob")
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * The pilot's sex. (Required)
	 * 
	 */
	@JsonProperty("sex")
	public String getSex() {
		return sex;
	}

	/**
	 * The pilot's sex. (Required)
	 * 
	 */
	@JsonProperty("sex")
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * The hypermedia URL for the pilot. (Required)
	 * 
	 */
	@JsonProperty("url")
	public URI getUrl() {
		return url;
	}

	/**
	 * The hypermedia URL for the pilot. (Required)
	 * 
	 */
	@JsonProperty("url")
	public void setUrl(URI url) {
		this.url = url;
	}

	/**
	 * The pilot's age in years. (Required)
	 * 
	 */
	@JsonProperty("age")
	public Integer getAge() {
		return age;
	}

	/**
	 * The pilot's age in years. (Required)
	 * 
	 */
	@JsonProperty("age")
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * The number of aircraft this pilot has been trained and certified to fly.
	 * (Required)
	 * 
	 */
	@JsonProperty("aircraft_count")
	public Integer getAircraftCount() {
		return aircraftCount;
	}

	/**
	 * The number of aircraft this pilot has been trained and certified to fly.
	 * (Required)
	 * 
	 */
	@JsonProperty("aircraft_count")
	public void setAircraftCount(Integer aircraftCount) {
		this.aircraftCount = aircraftCount;
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