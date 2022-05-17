package com.jobiak.mvc.model;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SignupBean implements Serializable {
@NotEmpty(message="can leave the field empty")
@Size(min=10,max=10,message="have to enter 10 digits")
@Valid
private String mobile;

@NotBlank(message="Can't leave field empty")
@Valid
@Email
private String email;

@NotEmpty(message="can leave the field empty")
@Size(min=12,max=12,message="have to enter 12 digits")
@Valid
private String aadhar;
	 
	 
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	

}
