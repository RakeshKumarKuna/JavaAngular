package com.atce.entity;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "paitent_annotation_one")
public class Paitent {
	@Id
	@GeneratedValue
	private Integer pID;
	private String pName;
	@ManyToMany(cascade = CascadeType.ALL,targetEntity = Docter.class
		,fetch = FetchType.LAZY,mappedBy = "paitents"
			)
	private Set<Docter> docter;
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
	public Set<Docter> getDocter() {
		return docter;
	}
	public void setDocter(Set<Docter> docter) {
		this.docter = docter;
	}

}
