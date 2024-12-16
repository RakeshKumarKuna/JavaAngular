package com.atce.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PhoneNumbers_annotation_Three")
public class PhoneNumbers implements Serializable {
  @Id
  @GeneratedValue
	private Integer id;
	private Long phno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "PhoneNumbers [id=" + id + ", phno=" + phno + "]";
	}
}
