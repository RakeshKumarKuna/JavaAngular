package com.atce.repositary;

import org.hibernate.annotations.HQLSelect;

import com.atce.entity.Student;

public interface HQL {
     @HQLSelect(query = "select * from Student where studentId=:id")
	public Student getbyID(int id);
}
