package com.naissur.jsf.validateDemo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="studThree")
public class StudentThree {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	// create no-args constructor
	
	public StudentThree() {
		/* NOP */
	}

	// create getter and setter methods for the fields
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
