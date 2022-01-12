package com.erp.solar.service.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.lead.activities.Notification;
import com.erp.solar.repository.lead.activities.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	private NotificationRepository notificationRepository;

	@Override
	public Notification newNotification(Notification notification) {
		// TODO Auto-generated method stub
		return notificationRepository.save(notification);
	}

}
