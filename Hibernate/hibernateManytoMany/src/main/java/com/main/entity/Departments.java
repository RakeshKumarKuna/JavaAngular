package com.main.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import com.main.entity.Employee;
@Entity
@Table(name = "dept_numfive")
public class Departments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	private String deptName;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Employee> emps;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<Employee> getEmps() {
		return emps;
	}
	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}

}
