package com.atce.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PhoneNumber_annotationfour")
public class PhoneNumber_annotation {
	@Id
	@GeneratedValue
	private int phId;
	private Long phno;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "person_Id",referencedColumnName = "pId")
	private Person_annotation person;
	public int getphId() {
		return phId;
	}
	public void setphId(int pId) {
		this.phId = pId;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public Person_annotation getPerson() {
		return person;
	}
	public void setPerson(Person_annotation person) {
		this.person = person;
	}
}
