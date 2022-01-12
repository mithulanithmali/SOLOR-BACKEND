package com.erp.solar.service.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.lead.activities.ActivityTask;
import com.erp.solar.repository.lead.activities.ActivityTaskRepository;

@Service
public class ActivityTaskServiceImpl implements ActivityTaskService{
	
	@Autowired
	private ActivityTaskRepository activityTaskRepository;

	@Override
	public ActivityTask newActivityTask(ActivityTask activityTask) {
		// TODO Auto-generated method stub
		return activityTaskRepository.save(activityTask);
	}

	@Override
	public ActivityTask updateActivityTask(ActivityTask activityTask) {
		// TODO Auto-generated method stub
		return activityTaskRepository.save(activityTask);
	}
	
	

}
