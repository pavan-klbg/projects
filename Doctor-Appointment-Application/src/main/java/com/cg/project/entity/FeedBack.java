package com.cg.project.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class FeedBack {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedBack_id;
	//private Doctor doctor;
	private int rating;

	private String comment;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patient;

}
