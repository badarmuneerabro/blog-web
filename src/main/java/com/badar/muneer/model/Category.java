package com.badar.muneer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category 
{
	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private int id;
	
	@Column(name = "NAME", length = 50)
	private String name;
	
	@Column(name = "DESCRIPTION", length = 200)
	private String description;
	
	public Category()
	{
		
	}
	
	
	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	

	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
