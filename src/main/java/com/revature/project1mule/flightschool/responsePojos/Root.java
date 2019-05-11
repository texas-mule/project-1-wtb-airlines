package project1mule;

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

/**
 * Flight School API Root
 * <p>
 * Links to the resources available on this API
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pilots", "aircraft", "certifications" })
public class Root {

	public Root() {
		super();
	}

	public Root(URI pilots, URI aircraft, URI certifications, Map<String, Object> additionalProperties) {
		super();
		this.pilots = pilots;
		this.aircraft = aircraft;
		this.certifications = certifications;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The link to the pilots resource (Required)
	 * 
	 */
	@JsonProperty("pilots")
	@JsonPropertyDescription("The link to the pilots resource")
	private URI pilots;
	/**
	 * The link to the aircraft resource (Required)
	 * 
	 */
	@JsonProperty("aircraft")
	@JsonPropertyDescription("The link to the aircraft resource")
	private URI aircraft;
	/**
	 * The link to the certifications resource (Required)
	 * 
	 */
	@JsonProperty("certifications")
	@JsonPropertyDescription("The link to the certifications resource")
	private URI certifications;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The link to the pilots resource (Required)
	 * 
	 */
	@JsonProperty("pilots")
	public URI getPilots() {
		return pilots;
	}

	/**
	 * The link to the pilots resource (Required)
	 * 
	 */
	@JsonProperty("pilots")
	public void setPilots(URI pilots) {
		this.pilots = pilots;
	}

	/**
	 * The link to the aircraft resource (Required)
	 * 
	 */
	@JsonProperty("aircraft")
	public URI getAircraft() {
		return aircraft;
	}

	/**
	 * The link to the aircraft resource (Required)
	 * 
	 */
	@JsonProperty("aircraft")
	public void setAircraft(URI aircraft) {
		this.aircraft = aircraft;
	}

	/**
	 * The link to the certifications resource (Required)
	 * 
	 */
	@JsonProperty("certifications")
	public URI getCertifications() {
		return certifications;
	}

	/**
	 * The link to the certifications resource (Required)
	 * 
	 */
	@JsonProperty("certifications")
	public void setCertifications(URI certifications) {
		this.certifications = certifications;
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