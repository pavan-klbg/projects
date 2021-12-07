package com.demo.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.demo.sms.service.StudentService;

@Controller
public class StudentController {
private StudentService studentService;

public StudentController(StudentService studentService) {
	super();
	this.studentService = studentService;
}
public String listStudents( Model model) {
	model.addAttribute("students", studentService.getAllStudents());
	return "students";
	
}

}
