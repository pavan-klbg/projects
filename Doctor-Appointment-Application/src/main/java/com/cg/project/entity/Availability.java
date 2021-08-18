package com.cg.project.entity;

import java.time.LocalDate;
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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Availability {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  availabilityId;
	private LocalDate fromdate;
	private LocalDate todate;

	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

}
