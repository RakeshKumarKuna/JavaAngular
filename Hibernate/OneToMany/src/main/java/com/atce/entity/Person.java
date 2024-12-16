package com.atce.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person_annotation_Three")
public class Person implements Serializable {
   @Id
   @GeneratedValue
	private Integer pId;
	private String pName;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = PhoneNumbers.class)
	@JoinColumn(name = "personId",referencedColumnName = "pId")
	private Set<PhoneNumbers> phno;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Set<PhoneNumbers> getPhno() {
		return phno;
	}
	public void setPhno(Set<PhoneNumbers> phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", phno=" + phno + "]";
	}
	
}
