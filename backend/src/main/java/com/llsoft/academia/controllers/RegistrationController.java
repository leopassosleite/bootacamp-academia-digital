package com.llsoft.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llsoft.academia.entities.Registration;
import com.llsoft.academia.services.RegistrationService;

@RestController
@RequestMapping(value = "/registrations")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping
	public ResponseEntity<List<Registration>> findAll() {
		List<Registration> list = registrationService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Registration> findById(@PathVariable Long id) {
		Registration obj = registrationService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}