package com.main.entity;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "per_tblsix")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer perId;
	private String perName;
	@OneToOne
	@MapsId
	private PanCard pan;
	public Integer getPerId() {
		return perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public PanCard getPan() {
		return pan;
	}
	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	

}
