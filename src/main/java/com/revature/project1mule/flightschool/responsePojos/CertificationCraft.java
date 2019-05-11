package com.revature.project1mule.flightschool.responsePojos;

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
@JsonPropertyOrder({ "id", "name", "certs", "pilot_count", "url" })
public class CertificationCraft {

	public CertificationCraft() {
		super();
	}

	public CertificationCraft(Integer id, String name, String certs, Integer pilotCount, String url,
			Map<String, Object> additionalProperties) {
		super();
		this.id = id;
		this.name = name;
		this.certs = certs;
		this.pilotCount = pilotCount;
		this.url = url;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The unique integer identifier for the aircraft. (Required)
	 * 
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("The unique integer identifier for the aircraft.")
	private Integer id;
	/**
	 * The name of the aircraft. (Required)
	 * 
	 */
	@JsonProperty("name")
	@JsonPropertyDescription("The name of the aircraft.")
	private String name;
	/**
	 * A comma-separated list of the certifications that allow a pilot to fly
	 * this aircraft. (Required)
	 * 
	 */
	@JsonProperty("certs")
	@JsonPropertyDescription("A comma-separated list of the certifications that allow a pilot to fly this aircraft.")
	private String certs;
	/**
	 * The number of pilots at Flight School who are certified to fly this
	 * aircraft. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	@JsonPropertyDescription("The number of pilots at Flight School who are certified to fly this aircraft.")
	private Integer pilotCount;
	/**
	 * The hypermedia URL for the aircraft. (Required)
	 * 
	 */
	@JsonProperty("url")
	@JsonPropertyDescription("The hypermedia URL for the aircraft.")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The unique integer identifier for the aircraft. (Required)
	 * 
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * The unique integer identifier for the aircraft. (Required)
	 * 
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The name of the aircraft. (Required)
	 * 
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * The name of the aircraft. (Required)
	 * 
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * A comma-separated list of the certifications that allow a pilot to fly
	 * this aircraft. (Required)
	 * 
	 */
	@JsonProperty("certs")
	public String getCerts() {
		return certs;
	}

	/**
	 * A comma-separated list of the certifications that allow a pilot to fly
	 * this aircraft. (Required)
	 * 
	 */
	@JsonProperty("certs")
	public void setCerts(String certs) {
		this.certs = certs;
	}

	/**
	 * The number of pilots at Flight School who are certified to fly this
	 * aircraft. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	public Integer getPilotCount() {
		return pilotCount;
	}

	/**
	 * The number of pilots at Flight School who are certified to fly this
	 * aircraft. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	public void setPilotCount(Integer pilotCount) {
		this.pilotCount = pilotCount;
	}

	/**
	 * The hypermedia URL for the aircraft. (Required)
	 * 
	 */
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	/**
	 * The hypermedia URL for the aircraft. (Required)
	 * 
	 */
	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
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