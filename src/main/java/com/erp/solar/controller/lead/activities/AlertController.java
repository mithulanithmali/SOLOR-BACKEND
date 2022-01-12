package com.erp.solar.controller.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.lead.activities.Alert;
import com.erp.solar.service.lead.activities.AlertService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/alert")
public class AlertController {
	
	@Autowired
	AlertService alertService;
	
	@PostMapping("/new-alert")
	public ResponseEntity<Alert>newAlert(@RequestBody Alert alert){
		System.out.println(alert);
		Alert new_alert = alertService.newAlert(alert);
		return new ResponseEntity<Alert>(new_alert, HttpStatus.CREATED);		
	}
	
	@PutMapping("/update-alert")
	public ResponseEntity<Alert>updateAlert(@RequestBody Alert alert){
		Alert update_alert = alertService.updateAlert(alert);
		return new ResponseEntity<Alert>(update_alert, HttpStatus.OK);	
	}

}
