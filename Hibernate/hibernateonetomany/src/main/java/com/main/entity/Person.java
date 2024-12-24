package com.main.entity;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "per_tblfive")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer perId;
	private String pname;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = PhoneNumbers.class)
	@JoinColumn(name = "personid" ,referencedColumnName = "perId")
	private Set<PhoneNumbers> phno;
	public Integer getPerId() {
		return perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Set<PhoneNumbers> getPhno() {
		return phno;
	}
	public void setPhno(Set<PhoneNumbers> phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", pname=" + pname + ", phno=" + phno + "]";
	}
	

}
