package com.erp.solar.controller.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.lead.activities.NewPhoneCall;
import com.erp.solar.service.lead.activities.NewPhoneCallService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/phone-call")
public class NewPhoneCallController {
	
	@Autowired
	NewPhoneCallService newPhoneCallService;
	
	@PostMapping("/new-phone-call")
	public ResponseEntity<NewPhoneCall>newPhoneCall(@RequestBody NewPhoneCall newPhoneCall){
		NewPhoneCall new_phone_call = newPhoneCallService.newPhoneCall(newPhoneCall);
		return new ResponseEntity<NewPhoneCall>(new_phone_call, HttpStatus.CREATED); 
		
	}
}
