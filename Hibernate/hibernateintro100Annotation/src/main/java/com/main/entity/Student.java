package com.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_tb2")
public class Student {
	@Id
	private Integer stuId;
	@Column(name = "sName")
	private String sName;
	@Column(name = "rollNo")
	private Integer rollNo;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", sName=" + sName + ", rollNo=" + rollNo + "]";
	}
}
