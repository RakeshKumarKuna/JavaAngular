package com.atce.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_annotationfour")
public class Person_annotation {
	@Id
	@GeneratedValue
	private Integer pId;
	@Column(name = "personname")
	private String name;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "person")
	private Set<PhoneNumber_annotation> phno;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<PhoneNumber_annotation> getPhno() {
		return phno;
	}

	public void setPhno(Set<PhoneNumber_annotation> phno) {
		this.phno = phno;
	}

	
}
