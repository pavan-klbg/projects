package com.cg.project.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String patientPhone;
	private String email;
	private String password;
	private String bloodGroup;
	private String gender;
	private int age;
	private Double weight;
	private String address;

	@OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
	private List<PatientIssue> patientIssueList;

	@OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
	private List<Appointment> appointmentList;

	@OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
	private List<FeedBack> feedBackList;


}