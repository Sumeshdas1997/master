package com.neosoft.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reg_user")
public class RegisterUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String regUserId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String department;
	
	@Column(name="date_of_birth")
	private String dob;

	@Column(name="date_of_joining")
	private String joinDate;
	
	private String city;
	
	private String state;
	
	private String pincode;
	
	private String address;

	public RegisterUser(String regUserId, String firstName, String lastName, String emailId, String department,
			String dob, String joinDate, String city, String state, String pincode, String address) {
		super();
		this.regUserId = regUserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.department = department;
		this.dob = dob;
		this.joinDate = joinDate;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.address = address;
	}

	public String getRegUserId() {
		return regUserId;
	}

	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	
	
	
}
