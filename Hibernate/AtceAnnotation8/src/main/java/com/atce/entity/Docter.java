package com.atce.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.metamodel.StaticMetamodel;

@Entity
@Table(name = "docter_annotation_one")
public class Docter implements Serializable {
	@Id
	@GeneratedValue
	private Integer dId;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,targetEntity = Paitent.class,fetch = FetchType.LAZY)
	@JoinTable(name = "doc_pat"
	                      ,joinColumns = @JoinColumn(name="doc_id"
	                                                                          ,referencedColumnName ="dId")
	                       ,inverseJoinColumns =@JoinColumn(name="pat_id"
	                                                                                       ,referencedColumnName = "pID")
	                      )
	private Set<Paitent> paitents;
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
	public Set<Paitent> getPaitent() {
		return paitents;
	}
	public void setPaitent(Set<Paitent> paitent) {
		this.paitents = paitent;
	}
}
