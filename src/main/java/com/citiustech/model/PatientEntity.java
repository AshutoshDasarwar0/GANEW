package com.citiustech.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PatientEntity {

	@Id
	private String fullname;
   	private String email;
	private String registrationdate;
	private String status;
	private String patientid;
	private String rolename;

	public PatientEntity() {
		super();
	}

	public PatientEntity(String fullName, String email, String registrationdate, String status, String patientid,
			String roleName) {
		super();
		this.fullname = fullName;
		this.email = email;
		this.registrationdate = registrationdate;
		this.status = status;
		this.patientid = patientid;
		this.rolename = roleName;
	}

	public String getFullName() {
		return fullname;
	}

	public void setFullName(String fullName) {
		this.fullname = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getpatientid() {
		return patientid;
	}

	public void setpatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getRoleName() {
		return rolename;
	}

	public void setRoleName(String roleName) {
		this.rolename = roleName;
	}

	@Override
	public String toString() {
		return "PatientEntity [fullName=" + fullname + ", email=" + email + ", registrationdate=" + registrationdate
				+ ", status=" + status + ", patientid=" + patientid + ", roleName=" + rolename + "]";
	}
	
	
	
	

}
