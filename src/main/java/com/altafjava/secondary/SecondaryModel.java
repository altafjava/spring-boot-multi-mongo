package com.altafjava.secondary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SecondaryModel {

	@Id
	private String id;
	private String value;

	@Override
	public String toString() {
		return "SecondaryModel [id=" + id + ", value=" + value + "]";
	}

	public SecondaryModel(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public SecondaryModel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
