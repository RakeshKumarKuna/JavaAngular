package com.atce.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Docter implements Serializable {
	@Id
	@GeneratedValue
	private Integer dId;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,targetEntity = Paitent.class)
	@JoinTable(name = "doc_pat"
	                      ,joinColumns = @JoinColumn(name="doc_id"
	                                                                          ,referencedColumnName ="dId")
	                       ,inverseJoinColumns =@JoinColumn(name="pat_id"
	                                                                                       ,referencedColumnName = "pID")
	                      )
	private List<Paitent> paitents;
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Paitent> getPaitent() {
		return paitents;
	}
	public void setPaitent(List<Paitent> paitent) {
		this.paitents = paitent;
	}
}
