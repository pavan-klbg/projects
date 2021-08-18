package com.cg.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.project.entity.Doctor;
import com.cg.project.entity.Patient;
import com.cg.project.exception.DoctorException;
import com.cg.project.exception.PatientException;
import com.cg.project.repository.DoctorRepository;



@Service
@Transactional
public  class DoctorServiceImpl  implements DoctorService{
	@Autowired
	private DoctorRepository repository;     
//	@Autowired
//	private PatientRepository drepository;

	// adding doctor
	@Override
	public Doctor addDoctor(Doctor doctor) throws DoctorException {
		try {
			doctor.setDoctorId(null);
			Doctor savedDoctor= repository.save(doctor);
			return savedDoctor;
		}catch(DataAccessException e) {
			throw new DoctorException(e.getMessage(),e);
		}
	}
	
	// updating doctor
	@Override
	public Doctor updateDoctor(Doctor doctor) throws DoctorException{
	try {
		Doctor savedDoctor= repository.save(doctor);
		return savedDoctor;
	}catch(DataAccessException e) {
		throw new DoctorException(e.getMessage(),e);
	}
	}
	
	// deleting doctor
	@Override
	public String deleteDoctor(Integer doctorId) throws DoctorException {
		try {
			repository.deleteById(doctorId);
			return  doctorId+ " deleted";
		}catch(DataAccessException e) {
			throw new DoctorException(e.getMessage(),e);
		}	
	}
	
	// get all doctors
	@Override
	public List<Doctor> getAllDoctor() throws DoctorException {
		try {
			List<Doctor> doctorList=repository.findAll();
			return doctorList;
		}catch(DataAccessException e) {
			throw new DoctorException(e.getMessage(),e);
		}
	}
	
	
	//get patient issue list
//	public List<Patient> getPatientIssueList() throws DoctorException {
//		try {
//			List<Patient> patientList=repository.findAll();
//			return patientList;
//		}catch(DataAccessException e) {
//			throw new PatientException(e.getMessage(),e);
//		}
//	}

}
