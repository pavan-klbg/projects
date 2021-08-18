package com.cg.project.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	private String remarks;
	private LocalDate appointment_date;
	private LocalTime appointment_time;
	

	@OneToOne(mappedBy = "appointment")
	private Doctor doctor;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patient;
}