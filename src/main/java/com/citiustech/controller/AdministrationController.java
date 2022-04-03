package com.citiustech.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.citiustech.model.PatientEntity;
import com.citiustech.model.UserEntity;
import com.citiustech.model.UserModel;
import com.citiustech.service.UserRegistrationService;
import com.citiustech.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdministrationController {
	
	@Autowired
	private UserService service;
	@Autowired
	private UserRegistrationService registrationService;
	
	@GetMapping("/get/patients")
	public ResponseEntity<List<PatientEntity>> getAllPatient(){
		List<PatientEntity> list=service.getAllPatient();
		System.out.println("getAllpatient called");
		return new ResponseEntity<List<PatientEntity>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/update/patient")
	public String updateStatus(@RequestBody PatientEntity patientEntity){
		service.updateStarus(patientEntity);
		System.out.println(patientEntity);
		return "update";
	}
	
	
	@GetMapping("/get/users")
	public ResponseEntity<List<UserEntity>> getAllUsers(){
		List<UserEntity> list=service.getAllUser();
		System.out.println("getAllpatient called");
		return new ResponseEntity<List<UserEntity>>(list,HttpStatus.OK);
	}
	
	
	@PostMapping("/reg/user")
	public String updateStatus(@RequestBody UserModel userModel){
		
		registrationService.saveUser(userModel);
		return "update";
	}
	
	
	

}
