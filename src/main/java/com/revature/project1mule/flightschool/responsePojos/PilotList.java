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
 * Pilot List
 * <p>
 * The list of pilots who have graduated from Flight School (TM)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "count", "next", "previous", "results" })
public class PilotList {

	public PilotList() {
		super();
	}

	public PilotList(Integer count, URI next, URI previous, List<PilotListResult> results,
			Map<String, Object> additionalProperties) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
		this.additionalProperties = additionalProperties;
	}

	/**
	 * The number of pilots in the result set. (Required)
	 * 
	 */
	@JsonProperty("count")
	@JsonPropertyDescription("The number of pilots in the result set.")
	private Integer count;
	/**
	 * The link to the next page in the list of pilots. (Required)
	 * 
	 */
	@JsonProperty("next")
	@JsonPropertyDescription("The link to the next page in the list of pilots.")
	private URI next;
	/**
	 * The link to the previous page in the list of pilots. (Required)
	 * 
	 */
	@JsonProperty("previous")
	@JsonPropertyDescription("The link to the previous page in the list of pilots.")
	private URI previous;
	/**
	 * The results of the lookup. (Required)
	 * 
	 */
	@JsonProperty("results")
	@JsonPropertyDescription("The results of the lookup.")
	private List<PilotListResult> results = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * The number of pilots in the result set. (Required)
	 * 
	 */
	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	/**
	 * The number of pilots in the result set. (Required)
	 * 
	 */
	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * The link to the next page in the list of pilots. (Required)
	 * 
	 */
	@JsonProperty("next")
	public URI getNext() {
		return next;
	}

	/**
	 * The link to the next page in the list of pilots. (Required)
	 * 
	 */
	@JsonProperty("next")
	public void setNext(URI next) {
		this.next = next;
	}

	/**
	 * The link to the previous page in the list of pilots. (Required)
	 * 
	 */
	@JsonProperty("previous")
	public URI getPrevious() {
		return previous;
	}

	/**
	 * The link to the previous page in the list of pilots. (Required)
	 * 
	 */
	@JsonProperty("previous")
	public void setPrevious(URI previous) {
		this.previous = previous;
	}

	/**
	 * The results of the lookup. (Required)
	 * 
	 */
	@JsonProperty("results")
	public List<PilotListResult> getResults() {
		return results;
	}

	/**
	 * The results of the lookup. (Required)
	 * 
	 */
	@JsonProperty("results")
	public void setResults(List<PilotListResult> results) {
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