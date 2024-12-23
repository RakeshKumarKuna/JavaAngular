package com.main.entity;

public class Student {
	private Integer stuId;
	private String sName;
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
