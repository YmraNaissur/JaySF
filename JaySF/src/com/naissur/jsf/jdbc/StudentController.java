package com.naissur.jsf.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean
@SessionScoped
public class StudentController {
	private List<Student> students;
	private StudentDbUtil studentDbUtil;
	private Logger logger = Logger.getLogger(getClass().getName());
	
	// generate no-args constructor
	
	public StudentController() throws Exception {
		students = new ArrayList<>();
		studentDbUtil = StudentDbUtil.getInstance();
	}

	/** Getter for the list of students.
	 * @return List of objects of the class Student.
	 */
	public List<Student> getStudents() {
		return students;
	}
	
	/**
	 * Load all students from the database.
	 */
	public void loadStudents(ComponentSystemEvent event) {
		logger.info("Loading students");
		students.clear();
		
		try {
			// Get all students from the database
			students = studentDbUtil.getStudents();
		} catch (Exception e) {
			// Send this to server logs
			logger.log(Level.SEVERE, "Error loading students", e);
			
			// Add error message for JSF page
			addErrorMessage(e);
		}
	}
	
	/**
	 * Load student with the specified ID from the database.
	 * @param id - student's ID.
	 * @return an object of class Student with the specified ID.
	 */
	public String loadStudent(int id) {
		logger.info("Loading student with id = " + id);
		
		try {
			// Load student from the database
			Student student = studentDbUtil.getStudent(id);
			
			// Put it in the request attribute... so we can use it on the form page
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("studentBean", student);
			
		} catch (Exception e) {
			// Send this to server logs
			logger.log(Level.SEVERE, "Error loading student with id = " + id);
			
			// Add error message for JSF page
			addErrorMessage(e);
			
			return null;
		}
		
		return "update-student-form";
	}
	
	/**
	 * Update student in the database.
	 * @param student - an object of class Student.
	 */
	public String updateStudent(Student student) {
		logger.info("Updating student: " + student);
		
		try {
			// Update student in the database
			int affectedRows = studentDbUtil.updateStudent(student);
			logger.info(affectedRows + " rows were affected.");
		} catch (Exception e) {
			// Send this to server logs
			logger.log(Level.SEVERE, "Error updating student: " + student);
			
			// Add error message for JSF page
			addErrorMessage(e);
			
			return null;
		}
		
		return "list-students";
	}
	
	/**
	 * Add student to the database.
	 * @param student - an object of class Student.
	 */
	public String addStudent(Student student) {
		logger.info("Adding student: " + student);
		
		try {
			// Add student to the database
			int affectedRows = studentDbUtil.addStudent(student);
			logger.info(affectedRows + " rows were affected.");
		} catch (Exception e) {
			// Send this to server logs
			logger.log(Level.SEVERE, "Error adding student", e);
			
			// Add error message for JSF page
			addErrorMessage(e);
			
			return null;
		}
		
		return "list-students";
	}
	
	/**
	 *  Send an error message to the faces context
	 *  @param e - exception.
	 */
	private void addErrorMessage(Exception e) {
		FacesMessage message = new FacesMessage("Error: " + e.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
