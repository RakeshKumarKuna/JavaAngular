package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ph_numfive")
public class PhoneNumbers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer phId;
	private Long phno;
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
