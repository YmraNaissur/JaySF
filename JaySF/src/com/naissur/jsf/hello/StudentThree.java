package com.naissur.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentThree {
	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	private List<String> langValues;
	
	// no-args constructor
	
	public StudentThree() {
		langValues = new ArrayList<>();
		langValues.add("Java");
		langValues.add("C++");
		langValues.add("Assembler");
		langValues.add("Pascal");
	}

	// getter and setter methods
	
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	// getter for the programming languages list
	
	public List<String> getLangValues() {
		return langValues;
	}
}
