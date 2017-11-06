package com.naissur.jsf.validateDemo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "studTwo")
public class StudentTwo {
	private String firstName;
	private String lastName;
	private int freePasses;
	private String postalCode;
	
	// create no-args constructor
	
	public StudentTwo() {
		/* NOP */
	}

	// generate getter and setter methods for the fields
	
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

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}