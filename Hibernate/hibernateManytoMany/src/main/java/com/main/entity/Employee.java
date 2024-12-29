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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String empName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "empdept",joinColumns = @JoinColumn(name="empId",referencedColumnName = "empId"),inverseJoinColumns = @JoinColumn(name="deptid",referencedColumnName = "deptId"))
	private Set<Departments> depts;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Set<Departments> getDepts() {
		return depts;
	}
	public void setDepts(Set<Departments> depts) {
		this.depts = depts;
	}
	

}
