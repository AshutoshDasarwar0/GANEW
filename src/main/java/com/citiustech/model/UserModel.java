package com.citiustech.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

	@Id
	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String role;
	private String employeeId;
	private LocalDate localDate;
	
	

	public UserModel() {
		super();
	}

	public UserModel(String userId,String title, String firstName, String lastName, String email, String date, String role,
			String employeeId,LocalDate localDate) {
		super();
		
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = date;
		this.role = role;
		this.employeeId = employeeId;
		this.localDate=LocalDate.now();
	}

	public String getTitle() {
		return title;
	}
	
	

	

	public String getLocalDate() {
		return localDate.toString();
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getDate() {
		return dateOfBirth;
	}

	public void setDate(String date) {
		this.dateOfBirth = date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "UserModel [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", role=" + role + ", employeeId=" + employeeId + ", localDate="
				+ localDate + "]";
	}


	

}
