package com.main.repositary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Student;

public interface IStudentRepo extends JpaRepository<Student,Integer> {

}
