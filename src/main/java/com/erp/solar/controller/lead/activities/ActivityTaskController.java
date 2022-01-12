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

import com.erp.solar.model.lead.activities.ActivityTask;
import com.erp.solar.service.lead.activities.ActivityTaskService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("lead/activity-task")
public class ActivityTaskController {
	
	@Autowired
	ActivityTaskService activityTaskService;
	
	@PostMapping("/new-activity-task")
	public ResponseEntity<ActivityTask>newActivityTask(@RequestBody ActivityTask activityTask){
		System.out.println(activityTask);
		ActivityTask new_activity_task = activityTaskService.newActivityTask(activityTask);
		return new ResponseEntity<ActivityTask>(new_activity_task, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update-activity-task")
	public ResponseEntity<ActivityTask>updateActivityTask(@RequestBody ActivityTask activityTask){
		ActivityTask update_activity_task = activityTaskService.updateActivityTask(activityTask);
		return new ResponseEntity<ActivityTask>(update_activity_task, HttpStatus.OK);
		
	}
}
