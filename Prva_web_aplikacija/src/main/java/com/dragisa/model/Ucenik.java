package com.dragisa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UCENIK")

public class Ucenik {

	@Id
	@Column(name="UC_EMAIL")
	private String email;

	@Column(name="UC_PASSWORD")
	private String password;

	public Ucenik() {
		
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
