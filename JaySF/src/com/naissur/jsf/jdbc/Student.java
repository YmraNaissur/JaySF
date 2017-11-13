package com.naissur.jsf.jdbc;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String email;

	// generate no-args constructor
	public Student() {
		/* NOP */
	}
	
	// generate constructor using fields

	public Student(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// generate getter and setter methods for fields
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName="
				+ firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}
}
