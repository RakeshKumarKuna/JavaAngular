package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.main.beans.Student;

//@EnableAutoConfiguration
//@Configuration
//@ComponentScan
@SpringBootApplication
public class SpringbootintroApplication implements CommandLineRunner {
	
	@Autowired
	private  Student stu;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootintroApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		stu.method();
		
	}

}
