package com.naissur.jsf.listAndTableDemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String email;
	
	// generate no-args constructor
	
	public Student() {
		/* NOP */
	}
	
	// generate constructor using fields
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// generate getter methods for fields
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}
}
