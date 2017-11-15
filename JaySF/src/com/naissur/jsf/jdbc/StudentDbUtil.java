package com.naissur.jsf.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class StudentDbUtil {
	private static StudentDbUtil instance;
	private DataSource dataSource;
	private String jndiName = "java:comp/env/jdbc/student_tracker";
	
	/* Singleton pattern 
	 * We can get only one instance of the DB utility class */
	public static StudentDbUtil getInstance() throws Exception {
		if (instance == null) {
			instance = new StudentDbUtil();
		}
		return instance;
	}

	/* In the constructor we get a data source */
	public StudentDbUtil() throws Exception {
		dataSource = getDataSource();
	}
	
	/**
	 * Get the data source.
	 * @return An instance of the DataSource class.
	 * @throws NamingException
	 */
	private DataSource getDataSource() throws NamingException {
		Context context = new InitialContext();
		DataSource theDataSource = (DataSource) context.lookup(jndiName);
		return theDataSource;
	}
	
	/**
	 * Get a list of students from the database.
	 * @return An instance of class List, containing a list of students from the database.
	 * @throws Exception
	 */
	public List<Student> getStudents() throws Exception {
		List<Student> students = new ArrayList<>();
		
		String sql = "select * from student order by last_name";
		
		try (Connection conn = getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			
			// Process the result set
			while (rs.next()) {
				// Retrieve data from result set row
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				
				// Create new student object
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				// Add it to the list of students
				students.add(tempStudent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	/**
	 * Add student to the database.
	 * @param student - an object of class Student.
	 * @return the number of updated rows in the database.
	 */
	public int addStudent(Student student) {
		String sql = "insert into student (first_name, last_name, email) values (?, ?, ?)";
		int affectedRows = 0;
		
		try (Connection conn = getConnection();
			 PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			// Prepare SQL query
			stmt.setString(1, student.getFirstName());
			stmt.setString(2, student.getLastName());
			stmt.setString(3, student.getEmail());
			
			// Update the database
			affectedRows = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return affectedRows;
	}

	/** Retrieve connection to the data source */
	private Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
