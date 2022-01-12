package com.erp.solar.service.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.lead.activities.NewPhoneCall;
import com.erp.solar.repository.lead.activities.NewPhoneCallRepository;

@Service
public class NewPhoneCallServiceImpl implements NewPhoneCallService{
	
	@Autowired
	private NewPhoneCallRepository newPhoneCallRepository;

	@Override
	public NewPhoneCall newPhoneCall(NewPhoneCall newPhoneCall) {
		// TODO Auto-generated method stub
		return newPhoneCallRepository.save(newPhoneCall);
	}

}
