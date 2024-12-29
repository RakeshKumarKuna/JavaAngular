package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "pancardsix")
public class PanCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer panId;
	private String cardNo;
	@OneToOne(fetch = FetchType.LAZY)
	private Person person;
	public Integer getPanId() {
		return panId;
	}
	public void setPanId(Integer panId) {
		this.panId = panId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
