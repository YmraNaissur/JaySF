package com.naissur.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName;
	private String lastName;
	private String country;
	
	// list of countries for the drop-down list
	List<String> countryOptions;
	
	// no-arg constructor
	public StudentTwo() {
		countryOptions = new ArrayList<>();
		countryOptions.add("Russia");
		countryOptions.add("Ukraine");
		countryOptions.add("Kazakhstan");
		countryOptions.add("Belorussia");
		countryOptions.add("Finland");
		countryOptions.add("Kuba");
	}

	// getter/setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// need to add getter method for country options
	public List<String> getCountryOptions() {
		return countryOptions;
	}
}