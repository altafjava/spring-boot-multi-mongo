package com.altafjava.repository.primary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PrimaryModel {

	@Id
	private String id;
	private String value;

	@Override
	public String toString() {
		return "PrimaryModel [id=" + id + ", value=" + value + "]";
	}

	public PrimaryModel(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public PrimaryModel() {
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
