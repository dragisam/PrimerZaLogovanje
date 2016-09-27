package com.dragisa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="STUDENT")
@Getter
@Setter
public class Student {
	

	@Id
	@Column(name="EMAIL")
	private String email;

	@Column(name="PASSWORD")
	private String password;
	@Column(name="STUDENT_NAME")
	private String name;
	
	/*private Date dob;

	
	private String conpassword;
	private String sity;
	private String street;
	private String pincode;
*/

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		
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

	
}
