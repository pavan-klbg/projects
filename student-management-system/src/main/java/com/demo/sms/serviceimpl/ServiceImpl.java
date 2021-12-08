
package com.demo.sms.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.sms.entity.Student;
import com.demo.sms.repository.StudentRepository;
import com.demo.sms.service.StudentService;

@Service
public class ServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public ServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
