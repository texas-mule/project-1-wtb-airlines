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
 * A certification that Flight School students can earn.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "craft_count", "pilot_count", "url" })
public class CertificationListResult {

	public CertificationListResult() {
		super();
	}

	public CertificationListResult(Integer id, String name, Integer craftCount, Integer pilotCount, URI url,
			Map<String, Object> additionalProperties) {
		super();
		this.id = id;
		this.name = name;
		this.craftCount = craftCount;
		this.pilotCount = pilotCount;
		this.url = url;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The unique integer identifier for the certification. (Required)
	 * 
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("The unique integer identifier for the certification.")
	private Integer id;
	/**
	 * The name of the certification. (Required)
	 * 
	 */
	@JsonProperty("name")
	@JsonPropertyDescription("The name of the certification.")
	private String name;
	/**
	 * The number of aircraft a pilot with this certification will be able to
	 * fly. (Required)
	 * 
	 */
	@JsonProperty("craft_count")
	@JsonPropertyDescription("The number of aircraft a pilot with this certification will be able to fly.")
	private Integer craftCount;
	/**
	 * The number of Flight School pilots who have earned this legitimate
	 * certification. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	@JsonPropertyDescription("The number of Flight School pilots who have earned this legitimate certification.")
	private Integer pilotCount;
	/**
	 * The hypermedia URL for the certification. (Required)
	 * 
	 */
	@JsonProperty("url")
	@JsonPropertyDescription("The hypermedia URL for the certification.")
	private URI url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The unique integer identifier for the certification. (Required)
	 * 
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * The unique integer identifier for the certification. (Required)
	 * 
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The name of the certification. (Required)
	 * 
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * The name of the certification. (Required)
	 * 
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The number of aircraft a pilot with this certification will be able to
	 * fly. (Required)
	 * 
	 */
	@JsonProperty("craft_count")
	public Integer getCraftCount() {
		return craftCount;
	}

	/**
	 * The number of aircraft a pilot with this certification will be able to
	 * fly. (Required)
	 * 
	 */
	@JsonProperty("craft_count")
	public void setCraftCount(Integer craftCount) {
		this.craftCount = craftCount;
	}

	/**
	 * The number of Flight School pilots who have earned this legitimate
	 * certification. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	public Integer getPilotCount() {
		return pilotCount;
	}

	/**
	 * The number of Flight School pilots who have earned this legitimate
	 * certification. (Required)
	 * 
	 */
	@JsonProperty("pilot_count")
	public void setPilotCount(Integer pilotCount) {
		this.pilotCount = pilotCount;
	}

	/**
	 * The hypermedia URL for the certification. (Required)
	 * 
	 */
	@JsonProperty("url")
	public URI getUrl() {
		return url;
	}

	/**
	 * The hypermedia URL for the certification. (Required)
	 * 
	 */
	@JsonProperty("url")
	public void setUrl(URI url) {
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