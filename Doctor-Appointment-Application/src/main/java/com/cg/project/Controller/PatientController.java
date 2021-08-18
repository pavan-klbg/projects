package com.cg.project.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.entity.Appointment;
import com.cg.project.entity.Patient;

import java.util.List;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class PatientController {

	// Method to add patient
	@PostMapping("/addPatient")
	public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {

		return new ResponseEntity<Patient>( HttpStatus.OK);
	}

	// method to delete patient
	@DeleteMapping("/removePatient/{patientId}")
	public ResponseEntity<Patient> removePatientDetails(@PathVariable int patientId) {

		return new ResponseEntity<Patient>( HttpStatus.OK);
	}

	// Method to edit patient
	@PutMapping("/editPatientProfile/{id}")
	public ResponseEntity<Patient> editPatientProfile(@Valid @RequestBody Patient patient,@PathVariable int id) {
		return new ResponseEntity<Patient>( HttpStatus.OK);
	}	

	

	// method to Add Appointment
	@PostMapping("/addAppointment")
	public ResponseEntity<Boolean> addAppointment(@Valid @RequestBody Appointment appointment) {

		return new ResponseEntity<Boolean>( HttpStatus.OK);
	}

	// method to Update Appointment
	@PutMapping("/updateAppointment/{id}")
	public ResponseEntity<Boolean> updateAppointment( @RequestBody Appointment appointment,@PathVariable int id) {

		return new ResponseEntity<Boolean>( HttpStatus.OK);
	}

	// Remove Appointments with Id
	@DeleteMapping("/deleteAppointment/{id}")
	public ResponseEntity<Boolean> deletePatientAppointment(@PathVariable int id) {

		return new ResponseEntity<Boolean>( HttpStatus.OK);
	}
	
// method to add patient issues
	@PostMapping("/addPatientIssues/{id}")
	public ResponseEntity<Patient> addPatientIssue(@RequestBody Patient Issues,@PathVariable int id){
		
		return new ResponseEntity<Patient>(HttpStatus.OK);
	}
	
	// add Feedback details
	@PostMapping("/addFeedback")
	public ResponseEntity<Patient> addFeedback(@Valid @RequestBody Patient feedback) {

		return new ResponseEntity<Patient>( HttpStatus.OK);
	}

	// method to validate patient credential
		@GetMapping("/validatePatient")
		public ResponseEntity<Patient> validatePatient(String patientName, String password) {

			return new ResponseEntity<Patient>( HttpStatus.OK);

		}



}
