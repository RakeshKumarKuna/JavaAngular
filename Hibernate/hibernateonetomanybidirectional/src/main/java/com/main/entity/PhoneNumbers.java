package com.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ph_numfive")
public class PhoneNumbers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer phId;
	@Override
	public String toString() {
		return "PhoneNumbers [phId=" + phId + ", phno=" + phno + ", person=" + person + "]";
	}
	private Long phno;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Integer getPhId() {
		return phId;
	}
	public void setPhId(Integer phId) {
		this.phId = phId;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
}
