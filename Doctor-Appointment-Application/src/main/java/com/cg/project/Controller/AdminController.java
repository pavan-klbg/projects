package com.cg.project.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.entity.Admin;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
public class AdminController {

	//  method to add admin details
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addAdmin(@Valid @RequestBody Admin admin) {

		return new ResponseEntity<Admin>( HttpStatus.OK);
	}

	// method to update admin details with Id
	@PutMapping("/updateAdmin/{adminId}")
	public ResponseEntity<Admin> updateAdmin(@Valid @RequestBody Admin admin) {

		return new ResponseEntity<Admin>( HttpStatus.OK);
	}

	//method to remove admin details with Id
	@DeleteMapping("/removeAdmin/{adminId}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable int adminId) {

		return new ResponseEntity<Admin>( HttpStatus.OK);
	}

	// method to view admin details with Id
	@GetMapping("/viewAdmin/{adminId}")
	public ResponseEntity<Admin> viewAdmin(@PathVariable int adminId) {

		return new ResponseEntity<Admin>( HttpStatus.OK);
	}

	@GetMapping("/validateAdmin")
	public ResponseEntity<Admin> validateAdmin(String adminName, String password) {

		return new ResponseEntity<Admin>( HttpStatus.OK);

	}



}