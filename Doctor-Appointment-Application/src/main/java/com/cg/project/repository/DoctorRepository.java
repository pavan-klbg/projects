package com.cg.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.entity.Doctor;
import com.cg.project.entity.PatientIssue;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
public List<PatientIssue> getPatientIssueList();
}
