package com.atce.entity;
import jakarta.persistence.MappedSuperclass;
@MappedSuperclass
public class ExtraStudentDetailes {
private String motherName;
private String fatherName;
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
}
