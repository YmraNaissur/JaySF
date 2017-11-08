package com.naissur.jsf.validateDemo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "studFour")
public class StudentFour {
	private String firstName;
	private String lastName;
	private String courseCode;
	
	// generate no-args constructor
	
	public StudentFour() {
		/* NOP */
	}

	/**
	 * Custom validation method
	 */
	public void validateCourseCode(FacesContext context,
								   UIComponent component,
								   Object value) throws ValidatorException {
		if (value == null) {
			return;
		}
		
		String data = value.toString();
		
		// Course code must start with "LUV" ... if not, throw exception
		if (!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage(component.getAttributes().get("label")
					+ ": Course code must start with \"LUV\"");
			throw new ValidatorException(message);
		}	
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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
