package com.main.ISevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Student;
import com.main.repositary.IStudentRepo;

@Service
public class StudentService {
	@Autowired
	private IStudentRepo repo;

	public String saveStudent(Student stu) {
		Student stu1 = repo.save(stu);
		return "student data saved with the id of " + stu1.getId();
	}
}
