package com.erp.solar.service.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.lead.activities.Alert;
import com.erp.solar.repository.lead.activities.AlertRepository;

@Service
public class AlertServiceImpl implements AlertService{
	
	@Autowired
	private AlertRepository alertRepository;

	@Override
	public Alert newAlert(Alert alert) {
		// TODO Auto-generated method stub
		return alertRepository.save(alert);
	}

	@Override
	public Alert updateAlert(Alert alert) {
		// TODO Auto-generated method stub
		return alertRepository.save(alert);
	}

}
