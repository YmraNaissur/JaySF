package com.naissur.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFour {
	private String firstName;
	private String lastName;
	// since the user can select multiple languages
	// we need an array of strings
	private String[] favoriteLanguages;
	List<String> langValues;
	
	// no-args constructor
	
	public StudentFour() {
		langValues = new ArrayList<>();
		langValues.add("Java");
		langValues.add("Assembler");
		langValues.add("Pascal");
		langValues.add("Basic");
		langValues.add("C++");		
	}

	// getter and setter methods for fields
	
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

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}

	// getter method for the list of languages
	
	public List<String> getLangValues() {
		return langValues;
	}
}
