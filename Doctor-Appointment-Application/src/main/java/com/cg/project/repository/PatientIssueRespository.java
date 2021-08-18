package com.cg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.entity.PatientIssue;

public interface PatientIssueRespository extends JpaRepository<PatientIssue, Integer>{
	

}
