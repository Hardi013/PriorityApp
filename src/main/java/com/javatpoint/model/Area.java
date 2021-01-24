package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Area {

	@Id
	@Column
	private int id;
	
	@Column
	private String Areas;
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreas() {
		return Areas;
	}

	public void setAreas(String areas) {
		Areas = areas;
	}
}
