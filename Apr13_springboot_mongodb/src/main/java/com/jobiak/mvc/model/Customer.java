package com.jobiak.mvc.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("customers")
public class Customer {

	private String first_name;
	private String last_name;
	private String gender;
	private String location;
	private Double age;
	private String occupation;
	
	public Customer(String first_name, String last_name, String gender, String location, Double age,
			String occupation) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.location = location;
		this.age = age;
		this.occupation = occupation;
	}

	
	public String getFirst_name() {
		return first_name;
	}
	

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	
	
	
	
	
}
