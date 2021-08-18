package com.cg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	

	
}
