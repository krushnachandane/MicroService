package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private String mobno;
	private String email;
	private String fees;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + ", email=" + email + ", fees=" + fees
				+ "]";
	}
	
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}

}
