package org.hl7.fhir;

import jakarta.json.bind.annotation.JsonbProperty;

public class Op{

	@JsonbProperty("description")
	private String description;

	@JsonbProperty("type")
	private String type;

	@JsonbProperty("items")
	private Items items;

	@JsonbProperty("$ref")
	private String ref;

	public String getDescription(){
		return description;
	}

	public String getType(){
		return type;
	}

	public Items getItems(){
		return items;
	}

	public String getRef(){
		return ref;
	}
}