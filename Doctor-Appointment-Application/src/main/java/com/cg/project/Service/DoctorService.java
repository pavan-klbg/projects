package com.cg.project.Service;

import java.util.List;

import com.cg.project.entity.Doctor;
import com.cg.project.entity.Patient;
import com.cg.project.exception.DoctorException;

public interface DoctorService {
	public  Doctor addDoctor(Doctor doctor) throws DoctorException;
	public  Doctor updateDoctor(Doctor doctor) throws DoctorException;
	public  String deleteDoctor(Integer doctorId) throws DoctorException;
	public  List<Doctor> getAllDoctor() throws DoctorException;
	
	//business logic
//	public List<Patient>getPatientIssueList() throws DoctorException;
}
