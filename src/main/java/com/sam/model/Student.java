package com.sam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -6509827564638298771L;

	@Column(name = "StudentName", nullable = false, length = 20)
	private String name;

	@Column(name = "StudentEmailId", nullable = false, length = 30)
	private String emailId;

	@Column(name = "StudentPhone", nullable = false, length = 10)
	private Long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", emailId=" + emailId + ", phone=" + phone + "]";
	}
	
}
