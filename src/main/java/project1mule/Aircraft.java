package project1mule;

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
 * Aircraft Object
 * <p>
 * An aircraft that Flight School pilots are trained and certified to fly.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "certs", "pilot_count", "url", "pilots" })
public class Aircraft {

	public Aircraft() {
		super();
	}

	public Aircraft(Integer id, String name, String certs, Integer pilotCount, URI url, List<AircraftPilot> pilots,
			Map<String, Object> additionalProperties) {
		super();
		this.id = id;
		this.name = name;
		this.certs = certs;
		this.pilotCount = pilotCount;
		this.url = url;
		this.pilots = pilots;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The unique integer identifier for this aircraft. (Required)
	 * 
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("The unique integer identifier for this aircraft.")
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
	 * The hypermedia URL of this resource. (Required)
	 * 
	 */
	@JsonProperty("url")
	@JsonPropertyDescription("The hypermedia URL of this resource.")
	private URI url;
	/**
	 * An array of the pilots at Flight School who are certified to fly this
	 * aircraft.
	 * 
	 */
	@JsonProperty("pilots")
	@JsonPropertyDescription("An array of the pilots at Flight School who are certified to fly this aircraft.")
	private List<AircraftPilot> pilots = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The unique integer identifier for this aircraft. (Required)
	 * 
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * The unique integer identifier for this aircraft. (Required)
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
	 * The hypermedia URL of this resource. (Required)
	 * 
	 */
	@JsonProperty("url")
	public URI getUrl() {
		return url;
	}

	/**
	 * The hypermedia URL of this resource. (Required)
	 * 
	 */
	@JsonProperty("url")
	public void setUrl(URI url) {
		this.url = url;
	}

	/**
	 * An array of the pilots at Flight School who are certified to fly this
	 * aircraft.
	 * 
	 */
	@JsonProperty("pilots")
	public List<AircraftPilot> getPilots() {
		return pilots;
	}

	/**
	 * An array of the pilots at Flight School who are certified to fly this
	 * aircraft.
	 * 
	 */
	@JsonProperty("pilots")
	public void setPilots(List<AircraftPilot> pilots) {
		this.pilots = pilots;
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