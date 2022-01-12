package com.erp.solar.controller.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.solar.model.lead.activities.Notification;
import com.erp.solar.service.lead.activities.NotificationService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/notification")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/new-notification")
	public ResponseEntity<Notification>newNotification(@RequestBody Notification notification){
		System.out.println(notification);
		Notification new_Notification = notificationService.newNotification(notification);
		return new ResponseEntity<Notification>(new_Notification, HttpStatus.CREATED);
	}

}
