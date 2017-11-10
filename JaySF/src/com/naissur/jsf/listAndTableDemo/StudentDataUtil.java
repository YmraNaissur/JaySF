package com.naissur.jsf.listAndTableDemo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	private List<Student> students;

	// generate no-args constructor
	
	public StudentDataUtil() {
		students = new ArrayList<>();
		
		students.add(new Student("Mary", "Public", "mary@yandex.ru"));
		students.add(new Student("John", "Doe", "john@yandex.ru"));
		students.add(new Student("Ajay", "Rao", "ajay@yandex.ru"));		
	}

	// generate getter for the field
	
	public List<Student> getStudents() {
		return students;
	}
}
