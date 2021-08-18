package com.cg.project.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer doctorId;
	private String doctorName;
	private String speciality;
	private String location;
	private String email;
	private String password;
	private String phoneNo;
	private int chargePerVisit;

	@OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY)
	private List<Availability> availabilityList;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinColumn(name = "appointment_id" )
	private Appointment appointment;

	@OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY)
	@JoinColumn(name="patientIssueId")
	private List<PatientIssue> patientIssuesList;

}
