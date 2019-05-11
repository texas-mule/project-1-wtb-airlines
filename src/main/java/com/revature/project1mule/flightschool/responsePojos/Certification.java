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
 * Certification Object
 * <p>
 * A certification that we offer here at Flight School.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "craft_count", "pilot_count", "url", "pilots", "craft" })
public class Certification {

	public Certification() {
		super();
	}

	public Certification(Integer id, String name, Integer craftCount, Integer pilotCount, URI url,
			List<CertificationPilot> pilots, List<CertificationCraft> craft, Map<String, Object> additionalProperties) {
		super();
		this.id = id;
		this.name = name;
		this.craftCount = craftCount;
		this.pilotCount = pilotCount;
		this.url = url;
		this.pilots = pilots;
		this.craft = craft;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The unique integer identifier for this certification. (Required)
	 * 
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("The unique integer identifier for this certification.")
	private Integer id;
	/**
	 * The name of this certification. (Required)
	 * 
	 */
	@JsonProperty("name")
	@JsonPropertyDescription("The name of this certification.")
	private String name;
	/**
	 * The number of aircraft that a pilot who earns this certification will be
	 * certified to fly. (Required)
	 * 
	 */
	@JsonProperty("craft_count")
	@JsonPropertyDescription("The number of aircraft that a pilot who earns this certification will be certified to fly.")
	private Integer craftCount;
	/**
	 * The number of pilots who have earned this certification here at Flight
	 * School. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	@JsonPropertyDescription("The number of pilots who have earned this certification here at Flight School.")
	private Integer pilotCount;
	/**
	 * The hypermedia URL of this resource. (Required)
	 * 
	 */
	@JsonProperty("url")
	@JsonPropertyDescription("The hypermedia URL of this resource.")
	private URI url;
	/**
	 * An array of the pilots who have earned this certification here at Flight
	 * School.
	 * 
	 */
	@JsonProperty("pilots")
	@JsonPropertyDescription("An array of the pilots who have earned this certification here at Flight School.")
	private List<CertificationPilot> pilots = null;
	/**
	 * An array of the aircraft that a pilot who earns this certification will
	 * be certified to fly.
	 * 
	 */
	@JsonProperty("craft")
	@JsonPropertyDescription("An array of the aircraft that a pilot who earns this certification will be certified to fly.")
	private List<CertificationCraft> craft = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The unique integer identifier for this certification. (Required)
	 * 
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * The unique integer identifier for this certification. (Required)
	 * 
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The name of this certification. (Required)
	 * 
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * The name of this certification. (Required)
	 * 
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The number of aircraft that a pilot who earns this certification will be
	 * certified to fly. (Required)
	 * 
	 */
	@JsonProperty("craft_count")
	public Integer getCraftCount() {
		return craftCount;
	}

	/**
	 * The number of aircraft that a pilot who earns this certification will be
	 * certified to fly. (Required)
	 * 
	 */
	@JsonProperty("craft_count")
	public void setCraftCount(Integer craftCount) {
		this.craftCount = craftCount;
	}

	/**
	 * The number of pilots who have earned this certification here at Flight
	 * School. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	public Integer getPilotCount() {
		return pilotCount;
	}

	/**
	 * The number of pilots who have earned this certification here at Flight
	 * School. (Required)
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
	 * An array of the pilots who have earned this certification here at Flight
	 * School.
	 * 
	 */
	@JsonProperty("pilots")
	public List<CertificationPilot> getPilots() {
		return pilots;
	}

	/**
	 * An array of the pilots who have earned this certification here at Flight
	 * School.
	 * 
	 */
	@JsonProperty("pilots")
	public void setPilots(List<CertificationPilot> pilots) {
		this.pilots = pilots;
	}

	/**
	 * An array of the aircraft that a pilot who earns this certification will
	 * be certified to fly.
	 * 
	 */
	@JsonProperty("craft")
	public List<CertificationCraft> getCraft() {
		return craft;
	}

	/**
	 * An array of the aircraft that a pilot who earns this certification will
	 * be certified to fly.
	 * 
	 */
	@JsonProperty("craft")
	public void setCraft(List<CertificationCraft> craft) {
		this.craft = craft;
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
