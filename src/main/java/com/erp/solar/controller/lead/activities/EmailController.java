package com.erp.solar.controller.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.lead.activities.Email;
import com.erp.solar.service.lead.activities.EmailService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/email")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@PostMapping("/new-email")
	public ResponseEntity<Email>newEmail(@RequestBody Email email){
		System.out.println(email);
		Email new_email = emailService.newEmail(email);
		return new ResponseEntity<Email>(new_email, HttpStatus.CREATED);
	}

}
