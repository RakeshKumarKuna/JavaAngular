package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.ISevice.StudentService;
import com.main.entity.Student;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner{
   @Autowired
	private StudentService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	   Student stu=new Student();
	   stu.setSname("jebin");
	   stu.setPhno(754959646l);
	   String res=	service.saveStudent(stu);
	   System.out.println(res);
		
	}

}
