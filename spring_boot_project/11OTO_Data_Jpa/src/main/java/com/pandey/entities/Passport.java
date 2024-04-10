package com.pandey.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer passportId;
	private String passportNum;
	
	private LocalDate isssueDate;
	private LocalDate expDate;
    
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public LocalDate getIsssueDate() {
		return isssueDate;
	}

	public void setIsssueDate(LocalDate isssueDate) {
		this.isssueDate = isssueDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
