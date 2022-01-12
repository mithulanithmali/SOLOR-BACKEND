package com.erp.solar.service.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.lead.activities.Email;
import com.erp.solar.repository.lead.activities.EmailRepository;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private EmailRepository emailRepository;

	@Override
	public Email newEmail(Email email) {
		// TODO Auto-generated method stub
		return emailRepository.save(email);
	}

}
