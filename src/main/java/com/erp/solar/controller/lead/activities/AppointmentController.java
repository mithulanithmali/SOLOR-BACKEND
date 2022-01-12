package com.erp.solar.controller.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.lead.activities.Appointment;
import com.erp.solar.service.lead.activities.AppointmentService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/new-appointment")
	public ResponseEntity<Appointment>addNewAppointment(@RequestBody Appointment appointment){
		System.out.println(appointment);
		Appointment new_Appointment = appointmentService.newAppointment(appointment);
		return new ResponseEntity<Appointment>(new_Appointment, HttpStatus.CREATED);		
	}
}
