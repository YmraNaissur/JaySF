package com.naissur.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFive {
	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	
	// a list of values for the favorite language
	// radio buttons in the JSF form
	private List<String> langValues;

	// no-args constructor
	
	public StudentFive() {
		langValues = new ArrayList<>();
		langValues.add("Java");
		langValues.add("Pascal");
		langValues.add("C++");
		langValues.add("Ruby");
		
		// pre-populate the bean
		favoriteLanguage = "Pascal";
		firstName = "Maximus";
		lastName = "Payne";
	}

	// getter and setter methods for the fields
	
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

	// getter method for the list of languages
	
	public List<String> getLangValues() {
		return langValues;
	}
}
