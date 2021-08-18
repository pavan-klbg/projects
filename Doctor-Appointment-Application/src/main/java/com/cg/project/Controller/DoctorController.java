package com.cg.project.Controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cg.project.Service.DoctorService;
import com.cg.project.Service.PatientService;
import com.cg.project.entity.Availability;
import com.cg.project.entity.Doctor;
import com.cg.project.entity.Patient;
import com.cg.project.exception.DoctorException;
import com.cg.project.exception.PatientException;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PatientService patientService;

	// method to add Doctor
	@PostMapping("/addDoctor")
	public ResponseEntity<Doctor> addDoctor(@Valid @RequestBody Doctor doctor) {
		try {

			Doctor e= doctorService.addDoctor(doctor);
			return new ResponseEntity<>(e,HttpStatus.OK);
		}catch(DoctorException e) {
			//			log.error(e.getMessage(),e);
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, "Unable to add doctor", e);
		}

	}

	// method to update doctor
	@PutMapping("/updateDoctor")
	public ResponseEntity<Doctor> updateDoctor(@Valid @RequestBody Doctor doctor) {
		try {
			Doctor e= doctorService.updateDoctor(doctor);
			return new ResponseEntity<>(e,HttpStatus.OK);
		}catch(DoctorException e) {
			//			log.error(e.getMessage(),e);
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, "Unable to update doctor", e);
		}
		//return new ResponseEntity<Doctor>( HttpStatus.OK);
	}
	
	
	@GetMapping("/doctor_list")
	public ResponseEntity<List<Doctor>> getDoctorList() {
		try {
			List<Doctor> doctorList=doctorService.getAllDoctor();
			return new ResponseEntity<>(doctorList,HttpStatus.OK);
		}catch(DoctorException e) {
			//	log.error(e.getMessage(),e);
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, "Unable to get patients", e);
		}

	}
	
	@GetMapping("/getPatientIssues/{id}")
	public ResponseEntity<List<Patient>> getPatientIssue(@RequestBody Patient Issues,@PathVariable int id){
		try {
			List<PatientIssueList> patientList=patientService.getPatientIssueList();
			return new ResponseEntity<>(patientList,HttpStatus.OK);
		}catch(PatientException e) {
			//	log.error(e.getMessage(),e);
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, "Unable to get patients", e);
		}

	}

//	// Method to get Doctor by id
//	@GetMapping("/getDoctor/{id}")
//	public ResponseEntity<Doctor> getDoctor(@PathVariable int id) {
//
//		return new ResponseEntity<Doctor>( HttpStatus.OK);
//	}

	
	// method to delete Doctor by id
	@DeleteMapping("/deleteDoctor/{id}")
	public ResponseEntity<String> deleteDoctor(@PathVariable(value = "id") Integer doctorId) {
		try {
			String status= doctorService.deleteDoctor(doctorId);
			return new ResponseEntity<>(status,HttpStatus.OK);

		}catch(DoctorException e) {
			//	log.error(e.getMessage(),e);
			throw new ResponseStatusException(
					HttpStatus.INTERNAL_SERVER_ERROR, "Unable to delete doctor", e);
		}
		
	}

	
	
	
	// method to add Availability
	@PostMapping("/addAvailability")
	public ResponseEntity<Boolean> addAvailability(@Valid @RequestBody Availability bean) {

		return new ResponseEntity<Boolean>( HttpStatus.OK);

	}

	// Method to update Availability
	@PutMapping("/updateAvailability/{id}")
	public ResponseEntity<Boolean> updateAvailability(@RequestBody Availability bean, @PathVariable int id) {

		return new ResponseEntity<Boolean>( HttpStatus.OK);

	}

	@GetMapping("/validateDoctor")
	public ResponseEntity<Doctor> validateDoctor(String doctorName, String password){

		return new ResponseEntity<Doctor>(HttpStatus.OK);
	}

	//method to view  feedbacklist by doctor
	@GetMapping("/getFeedbackListByDoctor")
	public ResponseEntity<List<Doctor>> getFeedbackListByDoctor(int doctorId) {


		return new ResponseEntity<List<Doctor>>( HttpStatus.OK);
	}

}
