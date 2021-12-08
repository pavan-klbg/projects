package com.demo.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.sms.entity.Student;
import com.demo.sms.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public String listStudents( Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";

	}

	@GetMapping("/students/new")
	public String newStudentForm(Model model) {
		// create student obj to hold form data
		Student student=new Student();
		model.addAttribute("student", student);
		return "new_student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
}