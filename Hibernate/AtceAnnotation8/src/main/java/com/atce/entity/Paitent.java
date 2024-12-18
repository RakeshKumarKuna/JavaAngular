package com.atce.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Paitent {
	@Id
	@GeneratedValue
	private Integer pID;
	private String pName;
	@ManyToMany(cascade = CascadeType.ALL,targetEntity = Paitent.class
		
			)
	private List<Docter> docter;
	public Integer getpID() {
		return pID;
	}
	public void setpID(Integer pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Docter> getDocter() {
		return docter;
	}
	public void setDocter(List<Docter> docter) {
		this.docter = docter;
	}

}
