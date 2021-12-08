package com.demo.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.sms.entity.Student;
import com.demo.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student stud1=new Student("pavan", "kumar", "pvn@gmail.com");
		studentRepository.save(stud1);
		
		Student stud2=new Student("ramesh", "patil", "ram15@gmail.com");
		studentRepository.save(stud2);
		
		Student stud3=new Student("vishwaa", "shetty", "vks199@gmail.com");
		studentRepository.save(stud3);
		
		
	}

}
