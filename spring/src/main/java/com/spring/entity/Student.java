package com.spring.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
@JsonInclude(JsonInclude.Include.NON_NULL)*/
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

@JsonPropertyOrder({"Student_Name"})
@JsonIgnoreProperties({"password","email"})
public class Student {
	
	private int id;
	
	@JsonProperty("Student_Name")
	private String name;
	private String email;
	private String password;
	private long mobileNo;
	private Date dob;
	private String gender;
	private Address studentAdd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(Address studentAdd) {
		this.studentAdd = studentAdd;
	}
}
