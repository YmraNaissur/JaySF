package com.naissur.jsf.validateDemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentOne {
	private String firstName;
	private String lastName;
	private String email;
	
	// no-args constructor
	
	public StudentOne() {
		/* NOP */
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}