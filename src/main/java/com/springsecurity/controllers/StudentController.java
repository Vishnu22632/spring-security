package com.springsecurity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@PreAuthorize("hasAuthority('ROLE_STUDENT')")
	@GetMapping("/studentLogin")
	public String getLogin() {
		return "student login";
	}
	
	@PreAuthorize("hasAuthority('ROLE_STUDENT')")
	@GetMapping("/studentSignup")
	public String getSignup() {
		return "student signup";
	}
	
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/admin")
	public String getAdmin() {
		return "Welcome admin";
	}
	
	@GetMapping("/exam")
	public String getExam() {
		return "Welcome to Exam";
	}
}
